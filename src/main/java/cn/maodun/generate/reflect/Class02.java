package cn.maodun.generate.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author DELL
 * @date 2022/8/2
 */
public class Class02 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<Man> manClass = Man.class;
        Man man = manClass.newInstance();

        Method[] methods = manClass.getMethods();
        for (Method method : methods){
            if (method.getName().equals("setBeard")){
                method.invoke(man, "长");
            }
        }
        for (Method method : methods){
            if (method.getName().equals("getBeard")){
                Object value = method.invoke(man);
                System.out.println(value);
            }
        }

        System.out.println("==========");
        System.out.println(man);
    }
}
