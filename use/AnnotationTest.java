package main.annotation.use;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import main.annotation.difine.TestAnnotation;
import main.annotation.pojo.Person;

/**
 * 注解测试类
 * @author fanwei
 *
 */
public class AnnotationTest
{
    public static void main(String[] args) throws Exception
    {
        //新建Person
        Person person = new Person();
        //获取Person的Class实例
        Class<Person> clazz = Person.class;
        // 获取 somebody() 方法的Method实例
        Method mSomeBody = clazz.getMethod("someBody", new Class[]
        { String.class, int.class });
        // 执行该方法
        mSomeBody.invoke(person, new Object[]
        { "lily", 18 });
        iteratorAnnotations(mSomeBody);

        // 获取 empty() 方法的Method实例
        Method mEmpty = clazz.getMethod("empty", new Class[]
        {});
        // 执行该方法
        mEmpty.invoke(person, new Object[]
        {});
        iteratorAnnotations(mEmpty);

    }

    public static void iteratorAnnotations(Method method)
    {
        // 判断 somebody() 方法是否包含TestAnnotation注解
        if (method.isAnnotationPresent(TestAnnotation.class))
        {
            // 获取该方法的TestAnnotation注解实例
            TestAnnotation testAnnotation = method.getAnnotation(TestAnnotation.class);
            // 获取 myAnnotation的值，并打印出来
            String[] values = testAnnotation.value();
            for (String str : values)
            {
                System.out.printf(str + ", ");
            }
            System.out.println();
        }

        // 获取方法上的所有注解，并打印出来
        Annotation[] annotations = method.getAnnotations();
        for (Annotation annotation : annotations)
        {
            System.out.println(annotation);
        }
    }
}
