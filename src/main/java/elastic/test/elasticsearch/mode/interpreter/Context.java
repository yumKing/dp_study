package elastic.test.elasticsearch.mode.interpreter;

import java.util.HashMap;

public class Context {

	private HashMap<String,String> map = new HashMap<>();
	
	//往环境类中设置值
	public void assign() {
		
	}
	
	//获取环境类的值
	public String lookup(String key) {
		return null;
	}
}
