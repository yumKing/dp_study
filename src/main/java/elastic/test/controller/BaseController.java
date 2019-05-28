package elastic.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import elastic.test.elasticsearch.common.bo.TestBO;
import elastic.test.elasticsearch.common.dao.EsBaseDao;
import elastic.test.redis.RedisCacheStore;
import elastic.test.testpackage.Form;

@Controller
@RequestMapping
public class BaseController {

	@Autowired
	private Validator customerValidatorFactory;
	@Autowired
	private RedisCacheStore redisCache;
	@Autowired
    private EsBaseDao esBaseDao;

	@RequestMapping(value = "/test/hello")
	@ResponseBody
	public void helloTest() {
		Form form = new Form();
		form.setCurrent("2015 11 11");
		BindException errors = new BindException(form, "target");
		customerValidatorFactory.validate(form, errors);
		System.out.println(errors.getFieldErrors());
	}
	
	@RequestMapping(value = "/test/redisTest")
	@ResponseBody
	public void redisTest(@RequestParam String site) {
		redisCache.hAdd("test", "test1", System.currentTimeMillis());
		System.out.println("save hash finish");
	}
	
	@RequestMapping(value = "/test/es")
	@ResponseBody
	public String saves(HttpServletRequest request) {
		try {
			ArrayList<String> list = new ArrayList<String>();
			list.add("25");
			list.add("44");
			list.add("99");
			Map<String,Object> fieldContentMap = new HashMap<String,Object>();
			fieldContentMap.put("age",39);
			List<TestBO> queryList = esBaseDao.queryList(TestBO.class, fieldContentMap, null, null, null);
			for(TestBO bo : queryList) {
				System.out.println(bo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "{\"ret\":\"0\"}";
	}
	
}
