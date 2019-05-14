package elastic.test.elasticsearch.common.controller;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import elastic.test.elasticsearch.common.bo.TestBO;
import elastic.test.elasticsearch.common.dao.EsBaseDao;


@Controller
@RequestMapping
public class ElasticsearchController {

	@Autowired
    private EsBaseDao esBaseDao;
	
	@RequestMapping(value = "/api/es/save")
	@ResponseBody
	public String saves(HttpServletRequest request) {
		try {
			TestBO test = new TestBO();
//			test.setId("test");
//			test.setAccount_number(500);
//			test.setBalance(10000);
//			test.setFirstname("Join");
//			test.setLastname("Jim");
//			test.setCity("hangzhou");
//			test.setEmail("123@126.com");
//			test.setAge(30);
//			test.setEmployer("Join jim");
//			test.setGender("M");
//			test.setState("CN");
			ArrayList<String> list = new ArrayList<String>();
			list.add("25");
			list.add("44");
			list.add("99");
			esBaseDao.deleteByIds(list, TestBO.class);
//			esBaseDao.insertOrUpdate(test);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "{\"ret\":\"0\"}";
	}
	
}
