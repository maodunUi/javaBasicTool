package cn.maodun.generate;

import cn.maodun.generate.generateClass.GenericsClass;
import org.junit.Test;

/**
 * @author xl
 * @date 2022/3/11
 */
public class GenericsClassTest {

    @Test
    public void test1() {
        GenericsClass generic = new GenericsClass("111111");
        GenericsClass generic1 = new GenericsClass(4444);
        GenericsClass generic2 = new GenericsClass(55.55);
        GenericsClass generic3 = new GenericsClass(false);

        System.out.println("泛型测试" + "key is " + generic.getKey());
        System.out.println("泛型测试" + "key is " + generic1.getKey());
        System.out.println("泛型测试" + "key is " + generic2.getKey());
        System.out.println("泛型测试" + "key is " + generic3.getKey());

    }


    /**
     * 测试类型通配符
     * 我们需要一个在逻辑上可以表示同时是Generic<Integer>和Generic<Number>父类的引用类型。由此类型通配符应运而生
     */
    @Test
    public void test2() {

        GenericsClass<Integer> gInteger = new GenericsClass<Integer>(123);
        GenericsClass<Number> gNumber = new GenericsClass<Number>(456);

        showKeyValue(gNumber);

        // showKeyValue这个方法编译器会为我们报错：Generic<java.lang.Integer>
        // cannot be applied to Generic<java.lang.Number>
//         showKeyValue(gInteger);
    }

    public void showKeyValue(GenericsClass<Number> obj) {
        System.out.println("泛型测试" + "key is " + obj.getKey());
    }

    // ? 是类型实参，不是类型形参。
    public void showKeyValue1(GenericsClass<?> obj) {
        System.out.println("泛型测试" + "key is " + obj.getKey());
    }

}
