package elastic.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import elastic.test.redis.RedisCacheStore;
import elastic.test.testpackage.Form;

@Controller
@RequestMapping
public class BaseController {

	@Autowired
	private Validator customerValidatorFactory;
	@Autowired
	private RedisCacheStore redisCache;

	@RequestMapping(value = "/api/helloTest")
	@ResponseBody
	public void helloTest() {
		Form form = new Form();
		form.setCurrent("2015 11 11");
		BindException errors = new BindException(form, "target");
		customerValidatorFactory.validate(form, errors);
		System.out.println(errors.getFieldErrors());
	}
	
	@RequestMapping(value = "/api/redisTest")
	@ResponseBody
	public void redisTest(@RequestParam String site) {
		redisCache.hAdd("site_listen", "WAK", System.currentTimeMillis());
		System.out.println("save hash finish");
	}
	
}
