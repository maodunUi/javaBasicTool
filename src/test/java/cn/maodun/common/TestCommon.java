package cn.maodun.common;

/**
 * @author DELL
 * @date 2022/4/8
 */
public class TestCommon {
    public static void main(String[] args) {
        String val = "10|100|" ;
        String[] split = val.split("\\|");

        System.out.println(split.length);
    }
}
