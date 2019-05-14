package elastic.test.ipproxy;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

import elastic.test.client.Client;
import elastic.test.client.DefaultClient;


public class IPGet {
	
	private Client client = new DefaultClient();
	
	private IParse parse;
	
	public IPGet(IParse parse) {
		this.parse = parse;
	}
	
	private String get(String url) {
		String asHtml = "";
		try {
			asHtml = client.get(url).asHtml();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return asHtml;
	}
	
	public List<JSONObject> parseResult(String url) {
		return parse.parse(get(url));
	}
}
