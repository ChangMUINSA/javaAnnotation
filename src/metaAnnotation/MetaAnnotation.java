package metaAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//测试元注解
@MyAnnotation
public class MetaAnnotation {
    @MyAnnotation
    public void test(){

    }

}
//定义一个注解
//@Target表示我们的注解可以用在那些地方
//@Retention表示我们的注解在什么地方还有效
//SOURCE<CLASS<RUNTIME
@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation{

}
