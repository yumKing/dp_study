package elastic.test.mode.Singleton;

import java.util.ArrayList;

public class LoadBalancer_new {

	private LoadBalancer_new() {
		
	}
	
	//由于静态单例对象没有作为LoadBalancer_new的成员变量直接实例化，因此类加载时不会实例化LoadBalancer_new
	//第一次调用getInstance()时将加载内部类HolderClass，
	//在该内部类中定义了一个static类型的变量instance，
	//此时会首先初始化这个成员变量，由Java虚拟机来保证其线程安全性，确保该成员变量只能初始化一次
	private static class HolderClass{
		private final static LoadBalancer_new instance = new LoadBalancer_new();
	}
	
	public static LoadBalancer_new getLoadBalancer() {
		return HolderClass.instance;
	}
	
	private ArrayList<String> serverlist = new ArrayList<>();
	
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
