package elastic.test.custom_annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用来标注一个注解为自定义注解的注解
 * @author jinyang
 *
 */
@Documented  
@Target(ElementType.ANNOTATION_TYPE)  
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotationSymbol {

}
