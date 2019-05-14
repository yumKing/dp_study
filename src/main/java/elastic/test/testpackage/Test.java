package elastic.test.testpackage;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.validation.BindException;
import org.springframework.validation.Validator;

@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration
@ContextConfiguration(locations={"file:E:\\jinyang\\pycharmProject\\elastic.test\\src\\main\\webapp\\WEB-INF\\app_context.xml", "file:E:\\jinyang\\pycharmProject\\elastic.test\\src\\main\\webapp\\WEB-INF\\spring-servlet.xml"})
public class Test {  
  
    @Autowired
    private Validator customerValidatorFactory;  
  
    @org.junit.Test
    public void helloTest() {
    	Form form = new Form();
        form.setCurrent("2015 11 11");
        BindException errors = new BindException(form, "target");  
        customerValidatorFactory.validate(form, errors);  
        System.out.println(errors.getFieldErrors());  
    }  
  
} 