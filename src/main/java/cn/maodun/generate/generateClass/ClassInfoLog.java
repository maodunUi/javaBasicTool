package cn.maodun.generate.generateClass;

import java.util.Arrays;

/**
 * @author DELL
 * @date 2022/3/11
 */
public class ClassInfoLog {

    public void info(Class<?> cls) {
        System.out.println("name:" + cls.getName());
        System.out.println("package:" + cls.getPackage());
        System.out.println("simpleName:" + cls.getSimpleName());
        System.out.println("classLoader:" + cls.getClassLoader());
        Arrays.asList(cls.getClasses()).stream().forEach(e -> System.out.println(e.getSimpleName()));


    }
}
