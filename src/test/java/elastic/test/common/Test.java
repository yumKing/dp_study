package elastic.test.common;

import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;

import elastic.test.client.DefaultClient;
import elastic.test.client.Response;

public class Test {

	public static void main(String[] args) throws Exception {
		String time = "2017-10-30 10:52";
		Date d = new Date(time.replaceAll("日", "").replaceAll("[\\u4e00-\\u9fa5]", "/").replaceAll("-", "/"));
		System.out.println(d.toLocaleString());
//		System.out.println(d.toGMTString());
		
		DefaultClient client = new DefaultClient();
		Map<String,String> headers = new HashMap<String,String>();
		headers.put("user-agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36");
		headers.put("content-type", "application/x-www-form-urlencoded");
		String form = "formhash=3ce5f284&srchtxt="+URLEncoder.encode("互金协会", "utf-8")+"&searchsubmit=yes";
		Response post = client.post("https://www.51kanong.com/search.php?mod=forum", headers, form, Charset.forName("UTF-8"));
		System.out.println(post.asHtml());
		client.close();
	}
}
