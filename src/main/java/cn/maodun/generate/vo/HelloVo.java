package cn.maodun.generate.vo;

import cn.maodun.generate.validation.annotation.ParamCheck;
import cn.maodun.generate.validation.annotation.ParamCheckRuleEnum;
import lombok.Data;

import java.util.Objects;

/**
 * @author DELL
 * @date 2023/3/8
 */
//@Data
public class HelloVo {
    @ParamCheck(rule = ParamCheckRuleEnum.NONULL,msg = "不能为空！")
    public String str;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelloVo helloVo = (HelloVo) o;
        return Objects.equals(str, helloVo.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str);
    }
}
