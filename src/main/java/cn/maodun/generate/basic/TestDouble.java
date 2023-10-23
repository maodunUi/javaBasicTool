package cn.maodun.generate.basic;

import java.math.BigDecimal;

/**
 * @author DELL
 * @date 2023/10/3
 */
public class TestDouble {
    public static void main(String[] args) {
        BigDecimal bigDecimal = BigDecimal.valueOf(Double.parseDouble("429572.00"));
        System.out.println(bigDecimal);
    }
}
