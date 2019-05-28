package elastic.test.mode.Singleton;
/**
 * 	为了节约系统资源，有时需要确保系统中某个类只有唯一一个实例，
 * 	当这个唯一实例创建成功之后，我们无法再创建一个同类型的其他对象，
 * 	所有的操作都只能基于这个唯一实例。为了确保对象的唯一性，我们可以通过单例模式来实现
 * 	
 * 	1、模拟实现Windows任务管理器
 * 
 * 	2、负载均衡器设计
 * 
 * 	单例模式
 * @author jinyang
 *
 */
public class Client {

	public static void main(String[] args) {
//		TaskManager tm = TaskManager.getInstance();
//		tm.displayPerformance();
//		tm.displayProcess();
//		tm.displayService();
//		tm.displayUsers();
		
		//创建四个LoadBalancer对象
		LoadBalancer_new balancer1,balancer2,balancer3,balancer4;
		balancer1 = LoadBalancer_new.getLoadBalancer();
		balancer2 = LoadBalancer_new.getLoadBalancer();
		balancer3 = LoadBalancer_new.getLoadBalancer();
		balancer4 = LoadBalancer_new.getLoadBalancer();
				
		//判断服务器负载均衡器是否相同
		if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
			System.out.println("服务器负载均衡器具有唯一性！");
		}
				
		//增加服务器
		balancer1.addServer("Server 1");
		balancer1.addServer("Server 2");
		balancer1.addServer("Server 3");
		balancer1.addServer("Server 4");
				
		//模拟客户端请求的分发
		for (int i = 0; i < 10; i++) {
            String server = balancer1.getServer();
			System.out.println("分发请求至服务器：  " + server);
		}
	}
}
