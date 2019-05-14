package elastic.test.ipproxy;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import com.alibaba.fastjson.JSONObject;

public abstract class IPool {

	private static BlockingQueue<JSONObject> proxys = new LinkedBlockingQueue<>(1<<10);
	
	public static BlockingQueue<JSONObject> getProxys(){
		return proxys;
	}
	
	public void run() {
		ThreadPool.getSchedulePool().scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
            if (proxys.size() < 5) {
                try {
                    proxys.addAll(getIP());
                } catch (Exception e) {
                }
            }
			}
		}, 0,5, TimeUnit.SECONDS);
	}
	
	protected abstract List<JSONObject> getIP();
}
