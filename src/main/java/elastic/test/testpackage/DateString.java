package elastic.test.testpackage;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 日期类型校验器注解
 * @author jinyang
 *
 */
@Documented  
@Target(ElementType.FIELD)  
@Retention(RetentionPolicy.RUNTIME)  
@CustomerValidator  
public @interface DateString {  
    String pattern() default "yyyy-MM-dd HH:mm:ss";  
  
    String errorCode() default "must date";  
  
    String message() default "must be date pattern";  
}  
