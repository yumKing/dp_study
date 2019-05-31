package elastic.test.ipproxy;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class ParseMode1 extends IParse {

	@Override
	public List<JSONObject> parse(String res) {
		ArrayList<JSONObject> defaultRet = new ArrayList<>(0);

		JSONObject json = JSONObject.parseObject(res);
		if (json == null || json.isEmpty()) {
			return defaultRet;
		}
		JSONArray array = json.getJSONArray("msg");
		if (array == null || array.isEmpty()) {
			System.out.println(json);
			return defaultRet;
		}
		List<JSONObject> list = new ArrayList<JSONObject>();
		for (int i = 0; i < array.size(); i++) {
			try {
				JSONObject js = array.getJSONObject(i);
				list.add(js);
			} catch (Exception e) {
				//TODO:不处理
			}
		}
		return list;
	}

}
