package cn.maodun.generate.controller;

import cn.maodun.generate.validation.annotation.ParamCheck;
import cn.maodun.generate.validation.annotation.ParamCheckRuleEnum;
import cn.maodun.generate.vo.HelloVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DELL
 * @date 2023/3/8
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(HelloVo helloVo){
        return "hello" + helloVo.getStr();
    }
}
