package cn.maodun.generate.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DELL
 * @date 2023/5/26
 */
public class TestCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);


        List<Integer> list2 = new ArrayList<>();
        list2.add(1);

        list.remove(1);

        list.forEach(element -> System.out.println(element));
    }
}
