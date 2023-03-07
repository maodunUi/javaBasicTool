package cn.maodun.generate.arithmetic;

import java.math.BigDecimal;

/**
 * @author DELL
 * @date 2022/8/22
 */
public class DataTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(0) ;
        bigDecimal =  bigDecimal.subtract(new BigDecimal(100)) ;
        System.out.println(bigDecimal.intValue());
    }
}
