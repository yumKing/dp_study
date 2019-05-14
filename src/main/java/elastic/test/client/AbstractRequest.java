package elastic.test.client;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;

import elastic.test.client.cookieFactory.CookieFactory;
import elastic.test.client.exception.FetchException;


public abstract class AbstractRequest implements Client {
	// 重试次数
	protected int retryCount = 3;
	// 代理ip
	protected ThreadLocal<Proxy> proxy = new ThreadLocal<Proxy>();
	// 超时时间
	protected ThreadLocal<TimeOut> timeout = new ThreadLocal<TimeOut>() {
		protected TimeOut initialValue() {
			return DEFAULT_TIMEOUNT;
		}
	};
	// cookie工厂
	protected final CookieFactory cookieFactory;
	// 用户代理
	protected ThreadLocal<UserAgent> userAgent = new ThreadLocal<UserAgent>();

	public AbstractRequest() {
		this(null);
	}

	public AbstractRequest(CookieFactory cookieFactory) {
		this.cookieFactory = cookieFactory;
	}

	@Override
	public Request setTimeOut(TimeOut timeout) {
		this.timeout.set(timeout);
		return this;
	}

	@Override
	public Request setRetryCount(int count) {
		this.retryCount = count;
		return this;
	}

	@Override
	public Request setUserAgent(UserAgent ua) {
		this.userAgent.set(ua);
		return this;
	}

	@Override
	public Request setProxy(Proxy proxy) {
		this.proxy.set(proxy);
		return this;
	}

	@Override
	public Response get(String url) throws FetchException{
		return get(url, null, Charset.forName("utf-8"));
	}

	@Override
	public Response post(String url, Map<String, String> headers, String form, Charset charset) throws FetchException{
		return post(url, headers, new StringEntity(form, charset));
	}

	@Override
	public Response post(String url, Map<String, String> headers, Map<String, String> form, Charset charset) throws FetchException{
		HttpEntity httpEntity = null;
		if(form != null) {
			List<NameValuePair> fs = new ArrayList<>();
			for(Map.Entry<String, String> entry : form.entrySet()) {
				fs.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
			}
			httpEntity = new UrlEncodedFormEntity(fs, charset);
		}
		
		return post(url, headers, httpEntity);
	}
	
	

}
