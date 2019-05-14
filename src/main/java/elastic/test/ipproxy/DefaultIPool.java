package elastic.test.ipproxy;

import java.util.List;
import com.alibaba.fastjson.JSONObject;

public class DefaultIPool extends IPool{
	
	@Override
	protected List<JSONObject> getIP() {
		IParse parse = new GeneralParse();
		IPGet ips = new IPGet(parse);
		return ips.parseResult("http://proxy.ip.com/random");
	}

}
