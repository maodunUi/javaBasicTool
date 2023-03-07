package cn.maodun.generate.reflect;

import java.lang.reflect.Field;

/**
 * @author DELL
 * @date 2022/8/2
 */
public class Class01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Man> manClass = Man.class;
        Man man = manClass.newInstance();
//        Field beardField = manClass.getField("beard");
//        String beard = (String) beardField.get(man);

//        System.out.println("beard toString " + beard);
//        System.out.println("man toString " + man.toString());
//
//        beardField.set(man,"长");
//        String changeBeard = (String) beardField.get(man);
//        System.out.println("beard toString " + changeBeard);
        // 返回public的字段。包含父类父接口
        Field[] fields = manClass.getFields();
        for(Field field : fields){
            System.out.println("属性名：" + field.getName());
        }
        System.out.println("=====================");
        // 本类的所有字段
        Field[] declaredFields = manClass.getDeclaredFields();
        for(Field declaredField : declaredFields){
            System.out.println("属性名：" + declaredField.getName());
        }
        System.out.println("=====================");
        Class<? super Man> superclass = manClass.getSuperclass();
        Field[] declaredSuperFields = superclass.getDeclaredFields();
        for(Field declaredSuperField : declaredSuperFields){
            System.out.println("父类属性名：" + declaredSuperField.getName());
        }

    }
}
