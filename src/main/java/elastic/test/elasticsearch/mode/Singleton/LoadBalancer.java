package elastic.test.elasticsearch.mode.Singleton;

import java.util.ArrayList;

public class LoadBalancer {
	//多线程中，要加入volatile, 禁止jvm优化代码，确保多个线程都能够正确处理
	//但是 可能会导致系统运行效率降低
	private volatile static LoadBalancer balancer = null;
	
	//饿汉模式，在getLoaderBalancer()直接返回
	//private static final LoadBalancer balancer = new LoadBalancer(); 

	private ArrayList<String> serverlist = new ArrayList<>();
	
	public static LoadBalancer getLoadBalancer() { 
		if(balancer == null) {  //懒汉模式
			
			synchronized (LoadBalancer.class) {
				if(balancer == null) {
					balancer = new LoadBalancer();
				}
			}
			
		}
		
		return balancer;
	}
	
	public void addServer(String server) {
		serverlist.add(server);
	}
	
	public void removeServer(String server) {
		serverlist.remove(server);
	}
	
	public String getServer() {
		int random = (int)Math.floor(Math.random()*serverlist.size());
		return serverlist.get(random);
	}
}
