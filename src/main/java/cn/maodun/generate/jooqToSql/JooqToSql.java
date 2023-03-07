package cn.maodun.generate.jooqToSql;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author DELL
 * @date 2023/3/7
 */
public class JooqToSql implements JooqToSqlUtil {
    public static void main(String[] args) {
        JooqToSql jooqToSql = new JooqToSql();

        String jooq = ".select(BID_RETURN_CONSIGNMENT_ORDER.PRD_NAME," +
                "BID_RETURN_CONSIGNMENT_ORDER.PRDDETAILID.as('prdDetailId')," +
                "BID_RETURN_CONSIGNMENT_ORDER.PRDDETAILCODE.as('prdDetailCode')," +
                "PD_PRODUCT.IMEI.as('imei')," +
                "NB_SALE_OUT.WAYBILLNO.as('waybillNo')," +
                "PD_PRODUCT.CHECKIMAGE.as('image')," +
                "PD_PRODUCT_CREATED_PRODUCT.DELIVERY_STATUS.as('status')," +
                "BID_RETURN_CONSIGNMENT_ORDER.CREATETM.as('orderTime'))" +
                ".from(BID_RETURN_CONSIGNMENT_ORDER)" +
                ".innerJoin(PD_PRODUCT).on(BID_RETURN_CONSIGNMENT_ORDER.PRDDETAILID.eq(PD_PRODUCT.PRDDETAILID))" +
                ".innerJoin(PD_PRODUCT_CREATED_PRODUCT).on(BID_RETURN_CONSIGNMENT_ORDER.PRDDETAILID.eq(PD_PRODUCT_CREATED_PRODUCT.PRDDETAILID))";

        String jooq2 = ".select(BID_RETURN_CONSIGNMENT_ORDER.PRD_NAME,\n" +
                "                BID_RETURN_CONSIGNMENT_ORDER.PRDDETAILID.as(\"prdDetailId\"),\n" +
                "                BID_RETURN_CONSIGNMENT_ORDER.PRDDETAILCODE.as(\"prdDetailCode\"),\n" +
                "                PD_PRODUCT.IMEI.as(\"imei\"),\n" +
                "                NB_SALE_OUT.WAYBILLNO.as(\"waybillNo\"),\n" +
                "                PD_PRODUCT.CHECKIMAGE.as(\"image\"),\n" +
                "                PD_PRODUCT_CREATED_PRODUCT.DELIVERY_STATUS.as(\"status\"),\n" +
                "                BID_RETURN_CONSIGNMENT_ORDER.CREATETM.as(\"orderTime\"))\n" +
                "                        .from(BID_RETURN_CONSIGNMENT_ORDER)\n" +
                "                        .innerJoin(PD_PRODUCT).on(BID_RETURN_CONSIGNMENT_ORDER.PRDDETAILID.eq(PD_PRODUCT.PRDDETAILID))\n" +
                "                        .innerJoin(PD_PRODUCT_CREATED_PRODUCT).on(BID_RETURN_CONSIGNMENT_ORDER.PRDDETAILID.eq(PD_PRODUCT_CREATED_PRODUCT.PRDDETAILID))\n" +
                "                        .innerJoin(NB_SALE_OUT_ITEM).on(BID_RETURN_CONSIGNMENT_ORDER.PRDDETAILID.eq(NB_SALE_OUT_ITEM.PRDDETAILID))\n" +
                "                        .innerJoin(NB_SALE_OUT).on(NB_SALE_OUT_ITEM.SALE_OUT_ID.eq(NB_SALE_OUT.ID))\n" +
                "                        .leftJoin(NB_CUSTOMER).on(NB_CUSTOMER.ID.eq(BID_RETURN_CONSIGNMENT_ORDER.CUSTOMER_ID))\n" +
                "                        .leftJoin(SL_UNION_ACCOUNT).on(NB_CUSTOMER.ID.eq(SL_UNION_ACCOUNT.CUSTOMER_ID))";



        String jooq3 = ".select(ML_EARNEST_MONEY.AMOUNT.as(\"amount\"),\n" +
                "                        ML_EARNEST_MONEY.TYPE.as(\"type\"),\n" +
                "                        ML_EARNEST_MONEY.REMARK.as(\"remark\"),\n" +
                "                        ML_EARNEST_MONEY.CREATETM.as(\"createTime\"))\n" +
                "                .from(ML_EARNEST_MONEY)";

        String jooq4 = ".select(BS_MSG_CENTER_ITEM.ID.as(\"id\"),\n" +
                "                        BS_MSG_CENTER.PUSH_TITLE.as(\"pushTitle\"),\n" +
                "                        BS_MSG_CENTER.PUSH_SUB_TITLE.as(\"pushSubTitle\"),\n" +
                "                        BS_MSG_CENTER.IMAGE.as(\"image\"),\n" +
                "                        BS_MSG_CENTER.URL.as(\"url\"),\n" +
                "                        BS_MSG_CENTER.MSG_CODE.as(\"msgCode\"),\n" +
                "                        BS_MSG_CENTER_ITEM.PUSH_TIME.as(\"pushTime\"))\n" +
                "                .from(BS_MSG_CENTER)\n" +
                "                .leftJoin(BS_MSG_CENTER_ITEM).on(BS_MSG_CENTER_ITEM.MSG_CODE.eq(BS_MSG_CENTER.MSG_CODE)\n" +
                "                        .and(BS_MSG_CENTER_ITEM.PUSH_USER_ID.eq(pushUserId)))";
        jooqToSql.doAction(jooq4);
    }


    /**
     * 复制语句要求：.select开头到join语句结束。不能解析where和其他分组语句。
     * 另外 语句会把innerjoin替换为leftjoin 因此需要解析后人工替换回去
     *
     * @param jooq jooq代码
     */
    private void doAction(String jooq) {
        preCheck(jooq);
        jooq = preDoAction(jooq);
        String[] split = jooq.split(DOT_FROM);
        // from前面的select语句
        String beforeFromSelect = split[0];

        String[] selectSplit = beforeFromSelect.split(DOT_SELECT);
        List<List<String>> allList = new ArrayList<>();
        // selectStr ==> (tableName.column.as('aliseName'),tableName.column.as('aliseName'))
        for (String selectStr : selectSplit) {
            if (StringUtils.isNotBlank(selectStr)) {
                allList.add(toSelectStr(selectStr));
            }
        }

        String fromSql = toFrom(split[1]);

        List<String> joinSqlList = toJoin(jooq);


        System.out.println("select ");

        List<String> lastList = allList.get(allList.size() - 1);
        String endStr = lastList.get(lastList.size() - 1);
        lastList.set(lastList.size()-1,endStr.replace(",",""));


        allList.forEach(list -> list.forEach(System.out::println));

        System.out.println("from " + fromSql);
        joinSqlList.forEach(System.out::println);
    }


    private List<String> toJoin(String jooq) {
        List<String> joinSqlList = new ArrayList<>();
        // innerJoins ==> [(tableName).on(tableName.column.eq(tableName.column)) ...]
        String[] innerJoins = jooq.split(DOT_LEFT_JOIN);
        if (innerJoins.length > 1) {
            int length = innerJoins.length;
            for (int i = 1; i < length; i++) {
                // innerJoin ==> (tableName).on(tableName.column.eq(tableName.column))
                String innerJoin = innerJoins[i];
                String[] splitByOn = innerJoin.split(DOT_ON);
                String joinTable = discardBracket(splitByOn[0]);
                // (BS_MSG_CENTER_ITEM.MSG_CODE.eq(BS_MSG_CENTER.MSG_CODE).and(BS_MSG_CENTER_ITEM.PUSH_USER_ID.eq(pushUserId)))
                String joinCondition = discardBracket(splitByOn[1]);
                // (BS_MSG_CENTER_ITEM.MSG_CODE.eq(BS_MSG_CENTER.MSG_CODE)
                // (BS_MSG_CENTER_ITEM.PUSH_USER_ID.eq(pushUserId)))
                String[] joinConditionByAndSplits = joinCondition.split(DOT_AND);
                String s = "inner join " + joinTable + " on ";
                joinSqlList.add(s);
                for (String joinConditionByAndSplit : joinConditionByAndSplits) {
                    if (joinConditionByAndSplit.contains(DOT_EQ)) {
                        String[] splitByEq = joinConditionByAndSplit.split(DOT_EQ);
                        s = splitByEq[0] + " = " + discardBracket(splitByEq[1]) + " and ";
                        joinSqlList.add(s);
                    }
                }
            }
        }
        String endStr = joinSqlList.get(joinSqlList.size() - 1);
        joinSqlList.set(joinSqlList.size() - 1, endStr.replace("and", BLANK_STR));
        return joinSqlList;
    }

    private String toFrom(String s) {
        if (s.contains(INNER_JOIN)) {
            String[] innerJoinSplits = s.split(DOT_INNER_JOIN);
            return discardBracket(innerJoinSplits[0]);
        }
        if (s.contains(LEFT_JOIN)) {
            String[] leftJoinSplits = s.split(DOT_LEFT_JOIN);
            return discardBracket(leftJoinSplits[0]);
        }
        return discardBracket(s);
    }

    private List<String> toSelectStr(String selectStr) {
        // tableName.column.as('aliseName'),tableName.column.as('aliseName')
        String multiColumnsStr = discardBracket(selectStr);
        // tableName.column.as('aliseName')
        String[] singleColumns = multiColumnsStr.split(",");
        List<String> allList = new ArrayList<>();
        if (singleColumns.length > 1) {
            for (String singleColumn : singleColumns) {
                if (StringUtils.isNotBlank(singleColumn)) {
                    allList.add(toSingleColumnSelectStr(singleColumn));
                }
            }
            return allList;
        }
        return Collections.singletonList(toSingleColumnSelectStr(selectStr));
    }

    private String toSingleColumnSelectStr(String subStr) {
        // .fields()结尾
        if (subStr.endsWith(DOT_FIELDS)) {
            return subStr.replace(DOT_FIELDS, ".*") + BLANK_COMMA;
        }
        // .as方式
        if (subStr.contains(DOT_AS)) {
            String[] split = subStr.split(DOT_AS);
            return split[0] + " as " + discardBracket(split[1]) + BLANK_COMMA;
        }
        // 普通模式
        return subStr + BLANK_COMMA;
    }
}
