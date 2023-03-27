package reflect.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  Java提供了元注解，是专门为我们定义的注解附加某些特性的
 *  比如:
 *  @Target:用于指定我们定义的注解可以被应用在什么位置
 *          具体的位置要使用ElementType来指定
 *
 *  @Retention:用于指定我们定义的注解的保留级别
 *             有三个可选值:
 *             RetentionPolicy.SOURCE       注解仅保留在.java文件的源代码中，编译后的字节码文件中看不到被标注的注解
 *             RetentionPolicy.CLASS        保留在字节码文件中，但是反射机制不能访问(默认的保留级别)
 *             RetentionPolicy.RUNTIME      保留在字节码文件中，并且可以被反射机制访问
 *
 */

/*必须放在要自动执行语句的上方*/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)  //可以被反射机制所访问
public @interface AutoRunClass {
}
