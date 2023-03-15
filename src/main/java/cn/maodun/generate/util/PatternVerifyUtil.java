package cn.maodun.generate.util;

import org.apache.commons.lang3.StringUtils;


/**
 * @author DELL
 * @date 2023/3/15
 */
public interface PatternVerifyUtil {

    /**
     * 是否手机号验证
     * 空检验为false
     * 校验长度为11位和只能为数字
     *
     * @param phone 手机号
     * @return true/false
     */
    default boolean isPhone(String phone) {
        return StringUtils.isNotBlank(phone) && phone.length() == 11 && StringUtils.isNumeric(phone);
    }

    /**
     * 校验不包含数字
     * 空检验为false
     * 不能包含数字
     *
     * @param name name
     * @return true/false
     */
    default boolean isNotContainNumber(String name) {
        return StringUtils.isNotBlank(name) && !name.matches(".+?\\d.+?");
    }

    /**
     * 校验不包含字符
     * 空检验为false
     * 不能包含字符
     *
     * @param str str
     * @return true/false
     */
    default boolean isNotContainWorld(String str) {
        return StringUtils.isNotBlank(str) && !str.matches(" [\\u4E00-\\u9FA5]+");
    }


    /**
     * 不是数字和字符
     * 空检验为false
     * 存在不是字符或者数字
     *
     * @param str str
     * @return true/false
     */
    default boolean isExistNotNumberOrChar(String str) {
        return StringUtils.isNotBlank(str) && !str.matches("^[A-Za-z0-9]+$ ");
    }
}
