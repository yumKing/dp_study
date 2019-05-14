package elastic.test.custom_annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/**
 * 标记注解，用来标记 自定义的注解处理器类,如果要在上下文中获取到处理器类，则需要被spring管理
 * @author jinyang
 *
 */
@Documented  
@Target(ElementType.TYPE)  
@Retention(RetentionPolicy.RUNTIME)  
@Component
public @interface CustomAnnotationHandlerSymbol {

}
