package elastic.test.elasticsearch.init;

import java.net.InetAddress;

import org.elasticsearch.action.admin.indices.alias.exists.AliasesExistResponse;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.Requests;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.ElasticsearchException;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


@Configuration
@EnableElasticsearchRepositories(basePackages = "elastic.test.elasticsearch/init/**")
public class ElasticsearchConfig {

	/**elasticsearch config*/
	@Value("${elasticsearch.cluster.name}") String clusterName;
    @Value("${elasticsearch.hosts}") String host;
    @Value("${elasticsearch.index}") String index;
    @Value("${elasticsearch.index.alias}") String indexAlia;
    @Value("${elasticsearch.client.transport.sniff}") String transportSniff;
    
    /**elasticsearch user permission*/
    @Value("${elasticsearch.user.path.home}") String pathHome;
    @Value("${elasticsearch.user.searchguard.ssl.transport.enabled}") String transportEnabled;
    @Value("${elasticsearch.user.keystore_filepath}") String keystoreFilepath;
    @Value("${elasticsearch.user.truststore_filepath}") String truststoreFilepath;
    @Value("${elasticsearch.user.keystore_password}") String keystorePassword;
    @Value("${elasticsearch.user.truststore_password}") String truststorePassword;
    @Value("${elasticsearch.user.enforce_hostname_verification}") String enforceHostnameVerification;
    
    private static final long DEFAULT_TIME_OUT = 5000;
    
	
	@Bean 
	public ElasticsearchTemplate elasticsearchTemplate() { 
		return new ElasticsearchTemplate(client()); 
	}
	 
    
    @Bean
    public Client client(){
    	try {
    		//SslUtils.ignoreSsl();
            // setting
            Settings settings = Settings.settingsBuilder()
            		.put("path.home", pathHome)
                    .put("cluster.name", clusterName)
                    .put("client.transport.sniff", transportSniff)
                    .put("searchguard.ssl.transport.enabled", transportEnabled)
                    /*.put(SSLConfigConstants.SEARCHGUARD_SSL_TRANSPORT_KEYSTORE_FILEPATH, keystoreFilepath)
                    .put(SSLConfigConstants.SEARCHGUARD_SSL_TRANSPORT_TRUSTSTORE_FILEPATH, truststoreFilepath)
                    .put(SSLConfigConstants.SEARCHGUARD_SSL_TRANSPORT_KEYSTORE_PASSWORD, keystorePassword)
                    .put(SSLConfigConstants.SEARCHGUARD_SSL_TRANSPORT_TRUSTSTORE_PASSWORD, truststorePassword)
                    .put("searchguard.ssl.transport.enforce_hostname_verification", enforceHostnameVerification)*/
                    .build();

            // create client
            String[] hosts = host.split(",");
            InetSocketTransportAddress[] addresses = new InetSocketTransportAddress[hosts.length];
            for (int i = 0; i < hosts.length; i++) {
                String[] hostPort = hosts[i].split(":");
                addresses[i] = new InetSocketTransportAddress(InetAddress.getByName(hostPort[0]), Integer.parseInt(hostPort[1]));
            }
            
            TransportClient client = TransportClient.builder().settings(settings)/*.addPlugin(SearchGuardSSLPlugin.class)*/.build().addTransportAddresses(addresses);
            //client.prepareSearch(index).putHeader("Authorization", "Basic "+Base64Util.encode("admin:admin"));

            IndicesExistsResponse indicesExistsResponse = client.admin().indices().exists(Requests.indicesExistsRequest(index)).actionGet();
            if (!indicesExistsResponse.isExists()) {
                client.admin().indices().prepareCreate(index).execute().actionGet(DEFAULT_TIME_OUT);
            }
            
            /*if (!indicesExistsResponse.isExists()) {
                client.admin().indices().prepareCreate(index).putHeader("Authorization", "Basic "+Base64Util.encode("worf:worf")).execute().actionGet(DEFAULT_TIME_OUT);
            }*/

            AliasesExistResponse aliasesExistResponse = client.admin().indices().prepareAliasesExist(indexAlia).execute().actionGet(DEFAULT_TIME_OUT);
            if (!aliasesExistResponse.isExists()) {
                client.admin().indices().prepareAliases().addAlias(index, indexAlia).execute().actionGet(DEFAULT_TIME_OUT);
            }
            
//            LoggerUtil.info(this, String.format("elasticsearch client init finished"));
            
            return client;
        } catch (Exception e) {
            throw new ElasticsearchException("elasticsearch client init failed", e);
        }
    }
}
