package elastic.test.testpackage;

import java.lang.annotation.Annotation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 注解处理器 实现，  为了方便扩展，使用一个注解来自动加载该处理器类
 * @author jinyang
 *
 */
@CustomerRule
public class DateValidatorRule extends AbstractCustomerValidatorRule {  
	  
    /** 
     * @see com.cathy.core.service.annotation.rule.CustomerValidatorRule#support(java.lang.annotation.Annotation, java.lang.Object) 
     */  
    @Override  
    public boolean support(Annotation annotation) {  
        return annotation instanceof DateString;  
  
    }  
  
    /** 
     * @see com.cathy.core.service.annotation.rule.AbastractCustomerValidatorRule#validProperty(java.lang.annotation.Annotation, java.lang.Object) 
     */  
    @Override  
    public void validProperty(Annotation annotation, Object property, PostHandler postHandler) {  
        DateString ds = (DateString) annotation;  
        if (parse(ds.pattern(), (String) property) == null) {  
            postHandler.postHanle(ds.errorCode(), ds.message());  
        }  
    }  
  
    private Date parse(String pattern, String property) {  
        try {  
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);  
            return sdf.parse(property);  
        } catch (ParseException e) {  
            //do noting  
        }  
        return null;  
    }  
}  
