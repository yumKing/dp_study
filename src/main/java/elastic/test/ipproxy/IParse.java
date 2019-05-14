package elastic.test.ipproxy;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

public interface IParse {

	public List<JSONObject> parse(String res);
}
