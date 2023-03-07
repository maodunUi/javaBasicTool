package cn.maodun.generate.reflect;

import java.lang.reflect.Field;

/**
 * @author DELL
 * @date 2022/7/9
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        Field name = personClass.getDeclaredField("name");
        name.set(person,"注入");
        System.out.println(person.toString());
    }
}
