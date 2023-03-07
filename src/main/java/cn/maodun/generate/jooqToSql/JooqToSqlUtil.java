package cn.maodun.generate.jooqToSql;

import org.apache.commons.lang3.StringUtils;

/**
 * @author DELL
 * @date 2023/3/7
 */
public interface JooqToSqlUtil {


    String LEFT_BRACKET = "(";
    String RIGHT_BRACKET = ")";
    String BLANK_STR = "";

   String BLANK_COMMA = " ,";
    String DOT_FROM = ".from";
    String DOT_EQ = ".eq";
    String DOT_ON = ".on";
    String DOT_SELECT = ".select";


    String DOT_FIELDS = ".fields()";

    String DOT_AS = ".as";
    String DOT_AND = ".and";

    String DOT_INNER_JOIN = ".innerJoin";
    String DOT_LEFT_JOIN = ".leftJoin";

    String INNER_JOIN = "innerJoin";
    String LEFT_JOIN = "leftJoin";

    default String discardBracket(String originalStr) {
        if (StringUtils.isNotBlank(originalStr)) {
            return originalStr.replace(LEFT_BRACKET, BLANK_STR).replace(RIGHT_BRACKET, BLANK_STR);
        }
        return originalStr;
    }

    default String preDoAction(String jooq2) {
        do {
            jooq2 = jooq2.replace("\t", "");
        } while (jooq2.contains("\t"));

        do {
            jooq2 = jooq2.replace("\n", "");
        } while (jooq2.contains("\n"));

        do {
            jooq2 = jooq2.replace("\"", "'");
        } while (jooq2.contains("\""));


        do {
            jooq2 = jooq2.replace(" ", "");
        } while (jooq2.contains(" "));

        if (jooq2.contains(INNER_JOIN)) {
            jooq2 = jooq2.replaceAll(INNER_JOIN, LEFT_JOIN);
        }

        return jooq2;
    }

    default void preCheck(String jooq) {
        if (!jooq.startsWith(DOT_SELECT)) {
            throw new RuntimeException("复制的语句请是.select开头");
        }
    }
}
