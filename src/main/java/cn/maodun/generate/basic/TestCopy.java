package cn.maodun.generate.basic;

import cn.maodun.generate.model.Person;
import org.modelmapper.ModelMapper;

import java.lang.reflect.InvocationTargetException;

/**
 * @author DELL
 * @date 2023/10/6
 */
public class TestCopy {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
//        Person p1 = new Person();
//        p1.setId(1);
//        p1.setName("1name");
//
//
//        Person p2 = new Person();
//        p2.setJob("2job");
//
//        BeanUtils.copyProperties(p1,p2);
//
//        System.out.println(p1);


        ModelMapper modelMapper = new ModelMapper();

        Person p1 = new Person();
        p1.setId(1);
        p1.setName("1name");

        Person p2 = new Person();
        p2.setJob("2job");

        Person merge = ObjectMerger.merge(p1, p2);
        System.out.println(merge);
    }

}
