package elastic.test.ipproxy;

import java.util.List;
import com.alibaba.fastjson.JSONObject;

public class DefaultIPool extends IPool{
	
	private String url;
	private IParse parse;
	
	public DefaultIPool(String url, IParse parse) {
		this.url = url;
		this.parse = parse;
	}
	
	@Override
	protected List<JSONObject> getIP() {
		IPGet ips = new IPGet(this.parse);
		return ips.parseResult(this.url);
	}

}
