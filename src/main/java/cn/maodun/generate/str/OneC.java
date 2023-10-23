package cn.maodun.generate.str;

import java.util.regex.Pattern;

/**
 * @author DELL
 * @date 2023/8/23
 */
public class OneC {
    public static void main(String[] args) {
        // 验证IMEI是否是连续相同的数字
        Pattern p = Pattern.compile("^(\\d)\\1+$");
        boolean matches = p.matcher("869105056655399").matches();
        System.out.println(matches);

    }

}
