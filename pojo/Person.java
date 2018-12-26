package main.annotation.pojo;

import main.annotation.difine.TestAnnotation;

/**
 * person pojo
 * @author fanwei
 *
 */
public class Person
{
    /**
     * empty()方法同时被 "@Deprecated" 和 “@TestAnnotation”所标注 
     * (01) @Deprecated，意味着empty()方法，不再被建议使用
     * (02) @TestAnnotation, 意味着empty() 方法对应的@TestAnnotation的value值是默认值"unknown"
     */
    @Deprecated
    @TestAnnotation
    public void empty()
    {
        System.out.println("\nempty");
    }

    /**
     * sombody() 被 @TestAnnotation(value={"girl","boy"}) 所标注，
     * @TestAnnotation(value={"girl","boy"}), 意味着@TestAnnotation的value值是{"girl","boy"}
     */
    @TestAnnotation(value =
    { "girl", "boy" })
    public void someBody(String name, int age)
    {
        System.out.println("\nsomebody: " + name + ", " + age);
    }
}
