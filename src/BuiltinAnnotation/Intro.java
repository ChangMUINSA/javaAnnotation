package BuiltinAnnotation;

public class Intro {
    /**
     * @Override : 定义在java.lang.Override中，此注释只适用于修辞方法，表示一个方法声明打算重写超类中的另一个方法声明
     * @Deprecated : 定义在java.lang.Deprecated中，此注释可以用于修辞方法，属性，类，表示不鼓励程序员使用这样的元素，通常是因为他很危险或者存在更好的选择
     * @SuppressWarnings : 定义在java.lang.SuppressWarnings中，用来抑制编译时的警告信息
     * 与前面两个注释有所不同，你需要添加一个参数才能正确使用，这些参数都是已经定义好了的，我们选择性的使用就好了
     * @SuppressWarnings("all")
     * @SuppressWarnings("unchecked")
     * @SuppressWarnings(value={"unchecked","deprecation"})
     */
}
