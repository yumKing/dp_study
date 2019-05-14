package elastic.test.custom_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import org.springframework.validation.Errors;

public interface ICustomAnnotationHandler {

	/** 
     * 判断是否支持该注解 
     * 
     * @param annotation 
     * @param property 
     * @return 
     */  
    public boolean support(Annotation annotation);
    
    public void handle(Annotation annotation, Object object, Field field, Errors errors)  
            throws Exception;   
}
