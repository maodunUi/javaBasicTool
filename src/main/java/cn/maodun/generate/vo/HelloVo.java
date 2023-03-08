package cn.maodun.generate.vo;

import cn.maodun.generate.validation.annotation.ParamCheck;
import cn.maodun.generate.validation.annotation.ParamCheckRuleEnum;
import lombok.Data;

/**
 * @author DELL
 * @date 2023/3/8
 */
@Data
public class HelloVo {
    @ParamCheck(rule = ParamCheckRuleEnum.NONULL,msg = "不能为空！")
    public String str;
}
