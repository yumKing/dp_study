package elastic.test.ipproxy;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class ParseMode3 extends IParse{

	@Override
	public List<JSONObject> parse(String res) {
		ArrayList<JSONObject> defaultRet = new ArrayList<>(0);
		JSONArray array = JSONObject.parseArray(res);
		
		if (array == null || array.isEmpty()) {
			System.out.println(array);
			return defaultRet;
		}
		List<JSONObject> list = new ArrayList<JSONObject>();
		int size = array.size();
		for(int i = 0; i < size;i++) {
			try {
				JSONObject obj = new JSONObject();
				JSONArray jarr = array.getJSONArray(i);
				String string = jarr.getString(0);
				String[] split = string.split(":");
				obj.put("ip", split[0]);
				obj.put("port", split[1]);
				list.add(obj);
			}catch(Exception e) {
				//TODO:no handle
			}
		}
		
		return list;
	}

}
