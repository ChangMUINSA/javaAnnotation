package metaAnnotation;

public class Intro {
    /**
     * 元注解的作用就是负责注解其他注解
     * Java定义了4个标准的meta-annotation类型，他们被用来提供对其他annotation类型做说明
     * 这些类型和他们所支持的类在java.lang.annotation包中可以找到
     * @Target : 用于描述注解的使用范围
     * @Retention ： 表示需要在什么级别保存该注释信息，用于描述注解的生命周期（SOURCE<CLASS<RUNTIME)
     * @Documented : 说明该注解将被包含在javadoc中
     * @Inherited ： 说明子类可以继承父类中的该注解
     */
}
