package main.annotation.difine;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解1
 * 每1个Annotation” 都与 “1个RetentionPolicy”关联，并且与 “1～n个ElementType”关联
 * @author fanwei
 *
 */
/** @Documented可有可无若没有定义，则Annotation不会出现在javadoc中 */
@Documented
/**
 * @Target的作用是用来指定Annotation的类型属性
 * 定义Annotation时，@Target可有可无。
 * 若有@Target，则该Annotation只能用于它所指定的地方；
 * 若没有@Target，则该Annotation可以用于任何地方
 * 
 * @Target(ElementType.TYPE) 的意思就是指定该Annotation的类型是ElementType.TYPE。
 * 这就意味着，MyAnnotation1是来修饰“类、接口（包括注释类型）或枚举声明”的注解
 * 
 * TYPE,                类、接口（包括注释类型）或枚举声明  
 *
 * FIELD,               字段声明（包括枚举常量）  
 *
 * METHOD,              方法声明  
 *
 * PARAMETER,           参数声明  
 *
 * CONSTRUCTOR,         构造方法声明  
 *
 * LOCAL_VARIABLE,      局部变量声明  
 *
 * ANNOTATION_TYPE,     注释类型声明  
 *
 * PACKAGE              包声明  
 * @author fanwei
 *
 */
@Target(ElementType.TYPE)
/**
 * @Retention的作用，就是指定Annotation的策略属性
 * @Retention(RetentionPolicy.RUNTIME) 的意思就是指定该Annotation的策略是RetentionPolicy.RUNTIME。
 * 这就意味着，编译器会将该Annotation信息保留在.class文件中，并且能被虚拟机读取。
 * 定义Annotation时，@Retention可有可无。若没有@Retention，则默认是RetentionPolicy.CLASS
 * 
 * SOURCE,             Annotation信息仅存在于编译器处理期间，编译器处理完之后就没有该Annotation信息了  
 * CLASS,              编译器将Annotation存储于类对应的.class文件中。默认行为 
 * RUNTIME             编译器将Annotation存储于class文件中，并且可由JVM读入 
 * @author fanwei
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1
{

}
