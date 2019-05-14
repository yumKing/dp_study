package elastic.test.ipproxy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
	
	public static ExecutorService getFixedThreadPool() {
		return Pool.fixedThreadPool;
	}
	
	public static ScheduledExecutorService getSchedulePool() {
		return SchedulePool.schedulePool;
	}
	
	public static ExecutorService getCachedPool() {
		return CachedPool.cachedPool;
	}

	private static class Pool{
		public static ExecutorService	fixedThreadPool = new ThreadPoolExecutor(
				getDefaultCorePoolSize(),      //corePoolSize 最小活跃数
				getDefaultCorePoolSize(),      //maximumPoolSize   最大线程数
				300,      //keepAliveTime  线程空闲时间
				TimeUnit.SECONDS,   //unit  单位：s
				new LinkedBlockingQueue<Runnable>(2<<10) //workQueue 阻塞队列大小
				);
		private static int getDefaultCorePoolSize(){
			return Runtime.getRuntime().availableProcessors()<<2;
		}
	}
	
	private static class SchedulePool{
		public static ScheduledExecutorService 	schedulePool = Executors.newScheduledThreadPool(1);
	}
	
	private static class CachedPool{
		public static ExecutorService	cachedPool = Executors.newCachedThreadPool();
	}
}
