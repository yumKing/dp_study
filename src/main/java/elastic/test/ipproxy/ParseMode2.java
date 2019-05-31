package elastic.test.ipproxy;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class ParseMode2 extends IParse{

	@Override
	public List<JSONObject> parse(String res) {
		List<JSONObject> tt = new ArrayList<JSONObject>();
		JSONObject jt = new JSONObject();
		String[] split = res.split(":");
		jt.put("ip", split[0]);
		jt.put("port", split[1]);
		tt.add(jt);
		return tt;
	}

}
