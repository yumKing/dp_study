package elastic.test.mode.Singleton;

/**
 * 	模拟windows任务管理器功能
 * 
 * @author jinyang
 *
 */
public class TaskManager {

	private static TaskManager tm = null;
	
	private TaskManager() {
		
	}
	
	public static TaskManager getInstance() {
		if(tm == null) {
			tm = new TaskManager();
		}
		
		return tm;
	}
	
	//显示进程
	public void displayProcess() {
		
	}
	
	//显示服务
	public void displayService() {
		
	}
	
	//显示性能
	public void displayPerformance() {
		
	}
	
	//显示用户
	public void displayUsers() {
		
	}
	
}
