package cn.maodun.generate.validation.annotation;

/**
 * @author DELL
 * @date 2022/8/2
 */
public interface RuleStrategy {
    String getRuleName() ;
    void rule(Object o,String ruleName,String msg) ;
}
