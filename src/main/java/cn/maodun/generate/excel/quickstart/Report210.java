package cn.maodun.generate.excel.quickstart;

import com.alibaba.excel.annotation.ExcelProperty;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author DELL
 * @date 2022/11/17
 */
public class Report210 {

    @ExcelProperty("订单编号")
    private String orderCode;

    @ExcelProperty("订单日期")
    private String CREATETM;
    @ExcelProperty("月份")
    private String MONTH;

    @ExcelProperty("付款日期")
    private String PAYTM;

    @ExcelProperty("到货日期")
    private String INTM2;
    @ExcelProperty("订单日期")
    private String CREATETM_D;
    @ExcelProperty("付款日期")
    private String PAYTM_D;
    @ExcelProperty("到货日期")
    private String INTM2_D;
    @ExcelProperty("付款月份")
    private String CREATMOTH;
    @ExcelProperty("结算批次")
    private String CLOSEBATCH;
    @ExcelProperty("付款周")
    private String WEEK;
    @ExcelProperty("所在单位")
    private String ORGID;
    @ExcelProperty("单位名称")
    private String ORGNAME;
    @ExcelProperty("位置")
    private String LOCALNAME;
    @ExcelProperty("事业部")
    private String CHANNELNAME1;
    @ExcelProperty("大区")
    private String CBCL2NAME;

    @ExcelProperty("闪回_省")
    private String CBCL3NAME;
    @ExcelProperty("渠道类型")
    private String CL11NAME;
    @ExcelProperty("闪回_区域")
    private String CBCL4NAME;
    @ExcelProperty("代理商")
    private String CHANNELNAME2;
    @ExcelProperty("二级区域")
    private String CL31NAME;

    @ExcelProperty("客户")
    private String CHANNELNAME4;
    @ExcelProperty("门店")
    private String CHANNELNAME;
    @ExcelProperty("极简订单")
    private String orderFlowType;
    @ExcelProperty("极简买家")
    private String ustomer_name;
    @ExcelProperty("明细ID")
    private String PRDDETAILID;
    @ExcelProperty("条码")
    private String PRDDETAILCODE;
    @ExcelProperty("大类")
    private String CTGNAME0;
    @ExcelProperty("小类")
    private String CTGNAME1;
    @ExcelProperty("品牌")
    private String CTGNAME;
    @ExcelProperty("机型")
    private String PRDNAME;
    @ExcelProperty("检测等级")
    private String CHECKLEVEL;
//    @ExcelProperty("主要问题")
//    private String ERROR_MAIN;
    @ExcelProperty("检测详情")
    private String PRD_DESC;
    @ExcelProperty("IMEI")
    private String IMEI;
    @ExcelProperty("数量")
    private String NUM;
    @ExcelProperty("顾客估价")
    private String PRICE_O;
    @ExcelProperty("检测价")
    private String PRICE_C;
    @ExcelProperty("回收价")
    private String PRICE;
    @ExcelProperty("回收均价")
    private String AVG_PRICE;


    @ExcelProperty("回收总价")
    private String PRICE_T;
    @ExcelProperty("销售数量")
    private String SAL_NUM;
    @ExcelProperty("销售金额")
    private String SALEPRICE;
    @ExcelProperty("销售均价")
    private String AVG_SD_PRICE;
    @ExcelProperty("去补贴成本")
    private String SALE_CB;
    @ExcelProperty("去补贴毛利")
    private String PROFT;
    @ExcelProperty("去补贴利率")
    private String PROFT_RATE;
    @ExcelProperty("检测毛利")
    private String PROFT_CHECK;
    @ExcelProperty("检测利率")
    private String PROFT_CHECK_RATE;
    @ExcelProperty("检测价差")
    private String DIFFPRICE;
    @ExcelProperty("销售税")
    private String SALES_RAX;
    @ExcelProperty("销售扣点")
    private String SALES_PLAT;
    @ExcelProperty("物流配件费用")
    private String SALES_OTHER;
    @ExcelProperty("检测费用")
    private String CHECK_PRICE;
    @ExcelProperty("维修费用")
    private String REPAIR_PRICE;
    @ExcelProperty("回收物流")
    private String PRICE_EXPRESS;
    @ExcelProperty("纯销售额")
    private String SALES_ALL;
    @ExcelProperty("促销增值")
    private String PRICE_PT;
    @ExcelProperty("追责补差")
    private String PRICE_C4;
    @ExcelProperty("佣金转增值")
    private String PRICE_C5;


    @ExcelProperty("三方补贴")
    private String PAY_PN;
    @ExcelProperty("店员奖励")
    private String SALES_PAY;
    @ExcelProperty("换新补贴")
    private String PRICE_C3;
    @ExcelProperty("其他店奖")
    private String DZ_PAY;
    @ExcelProperty("预估奖励")
    private String PAY_B3;
    @ExcelProperty("佣金")
    private String PAY_YJ;
    @ExcelProperty("佣金预估")
    private String PAY_YJ_PRE;
    @ExcelProperty("回收总成本")
    private String PRICE_ALL;
    @ExcelProperty("已售回收额")
    private String PRICE_SALE;
    @ExcelProperty("销售比例")
    private String sales_rate;
    @ExcelProperty("综合毛利")
    private String PAY_ZHML;
    @ExcelProperty("综合利率")
    private String PAY_ZHLL;
    @ExcelProperty("单台毛利")
    private String AVG_ML_PRICE;
    @ExcelProperty("预计毛利")
    private String profit_all;
    @ExcelProperty("盈利状况")
    private String MLQK;
    @ExcelProperty("渠道成本")
    private String PAY_QDCB;
    @ExcelProperty("渠道成本率")
    private String CHANNEL_RATE;
    @ExcelProperty("后端成本")
    private String BACKEND_CB;
    @ExcelProperty("后端成本率")
    private String BACKEND_CB_RATE;
    @ExcelProperty("模型跌价")
    private String PRICE_DOWN_MODEL;


    @ExcelProperty("AI跌价")
    private String PRICE_DOWN_AI;
    @ExcelProperty("模型跌价率")
    private String PRICE_DOWN_MODEL_RATE;
    @ExcelProperty("AI跌价率")
    private String PRICE_DOWN_AI_RATE;
    @ExcelProperty("预留利润")
    private String DEF_PRD_PRICE;
    @ExcelProperty("预留后台")
    private String DEF_BACK_PRICE;
    @ExcelProperty("预留跌价")
    private String DEF_DOWN_PRICE;
    @ExcelProperty("预留差错")
    private String DEF_ERROR_PRICE;


    @ExcelProperty("预留佣金店奖")
    private String DEF_CHANNEL_PRICE;
    @ExcelProperty("预留促销")
    private String DEF_PROM_PRICE;
    @ExcelProperty("预留支撑")
    private String DEF_CHANELADD_PRICE;
    @ExcelProperty("利润超")
    private String DEF_PRD_PRICE_ADD;
    @ExcelProperty("后台超")
    private String DEF_BACK_PRICE_ADD;
    @ExcelProperty("跌价超")
    private String DEF_DOWN_PRICE_ADD;
    @ExcelProperty("差错超")
    private String DEF_ERROR_PRICE_ADD;
    @ExcelProperty("渠道成本超")
    private String DEF_CHANNEL_PRICE_ADD;
    @ExcelProperty("利润超率")
    private String DEF_PRD_PRICE_RATE;
    @ExcelProperty("后台超率")
    private String DEF_BACK_PRICE_RATE;
    @ExcelProperty("跌价超率")
    private String DEF_DOWN_PRICE_RATE;
    @ExcelProperty("差错超率")
    private String DEF_ERROR_PRICE_RATE;
    @ExcelProperty("渠道成本超率")
    private String DEF_CHANNEL_PRICE_RATE;


    @ExcelProperty("规划销售毛利")
    private String GH_SALE_ML;
    @ExcelProperty("规划渠道成本")
    private String GH_CHANNEL_CB;
    @ExcelProperty("规划差错成本")
    private String GH_ERROR_CB;
    @ExcelProperty("规划后端成本")
    private String GH_BACKEND_CB;
    @ExcelProperty("规划跌价")
    private String GH_DOWN_PRICE;
    @ExcelProperty("规划利润")
    private String GH_PROFIT;
    @ExcelProperty("模型参考价")
    private String MODEL_PRICE;
    @ExcelProperty("AI参考价")
    private String AI_PRICE;
    @ExcelProperty("爬价")
    private String PAIJTANG_PRICE;
    @ExcelProperty("差错分级")
    private String CLERRORLEVEL;
    @ExcelProperty("订单状态")
    private String ORDERSTATUSNAME;
    @ExcelProperty("付款状态")
    private String PRDFINSTATUS;
    @ExcelProperty("库存状态")
    private String INVSTATUSNAME;
    @ExcelProperty("入库日期")
    private String INLOCALTM;
    @ExcelProperty("检测员")
    private String CHECKUSERNAME;
    @ExcelProperty("主要差异")
    private String CHECK_MAIN;
    @ExcelProperty("详细差异")
    private String CHECK_DETAIL;
    @ExcelProperty("门店选项")
    private String DETAIL_M;
    @ExcelProperty("审单选项")
    private String DETAIL_S;
    @ExcelProperty("审单差异")
    private String DETAIL_CY;


    @ExcelProperty("店员")
    private String SALESNAME;
    @ExcelProperty("店员手机")
    private String SMOBILE;
    @ExcelProperty("会员")
    private String MEMBERNAME;
    @ExcelProperty("会员手机")
    private String MOBILE;
    @ExcelProperty("会员省")
    private String ADDR_PROVINCE;
    @ExcelProperty("会员城市")
    private String ADDR_CITY;
    @ExcelProperty("会员区")
    private String ADDR_AREA;
    @ExcelProperty("第三方单号")
    private String partnercode;
    @ExcelProperty("快递单号")
    private String WAYBILLNO;
    @ExcelProperty("快递方式")
    private String POSTCOMPNAME;
    @ExcelProperty("价格段")
    private String price_stage;
    @ExcelProperty("门店ID")
    private String CHANNELID;
    @ExcelProperty("二检人")
    private String CHECK_NAME2;
    @ExcelProperty("二检主差")
    private String CHECK_MAIN2;
    @ExcelProperty("明细差异")
    private String CHECK_DETAIL2;
    @ExcelProperty("前端检测价")
    private String PRICE_FRONT;
    @ExcelProperty("库龄")
    private String STORE_DAY;
    @ExcelProperty("帮卖结算价")
    private String PRICE_JS;
    @ExcelProperty("发货日期")
    private String postTime;
    @ExcelProperty("活动")
    private String actname;


    @ExcelProperty("顾客手机号")
    private String memberMobile;
    @ExcelProperty("用户id")
    private String memberId;
    @ExcelProperty("申诉金额")
    private String appeal_price;
    @ExcelProperty("实际补款金额")
    private String supply_price;
    @ExcelProperty("首期机器款")
    private String prd_price;
    @ExcelProperty("申诉选项结果")
    private String appealstatus;
    @ExcelProperty("申诉选项")
    private String appealOptions;
    @ExcelProperty("价格政策")
    private String channelpricename;
    @ExcelProperty("价格类型")
    private String price_type;
    @ExcelProperty("上架次数")
    private String SALES_COMP_COUNT;
    @ExcelProperty("取消原因")
    private String remark;
    @ExcelProperty("门店差错系数")
    private String price_error_adjust_rate_shop;
    @ExcelProperty("客户差错系数")
    private String price_error_adjust_rate;
    @ExcelProperty("极简报价政策系数")
    private String channel_reward_rate;
    @ExcelProperty("产品权限")
    private String DEPARTMENTID;
    @ExcelProperty("一级区域")
    private String CL3NAME;
    @ExcelProperty("三级区域")
    private String CL32NAME;
    @ExcelProperty("收货物流号")
    private String EXPRESS_NUMBER;
    @ExcelProperty("订单流程")
    private String p_config_inquiry_price_tmp_type;
    @ExcelProperty("审单报价")
    private String verify_price;


    @ExcelProperty("下单方式")
    private String checktype;
    @ExcelProperty("内存")
    private String NC;
    @ExcelProperty("商品类型")
    private String PURCHASE_TYPE;
    @ExcelProperty("订单计数")
    private String countORDERCODE;
    @ExcelProperty("下单模式")
    private String order_page_type;
    @ExcelProperty("付款年份")
    private String PAYTM_Y;
    @ExcelProperty("核算单位")
    private String FINCNAME;
    @ExcelProperty("到仓日期")
    private String INTM;
    @ExcelProperty("客户类型")
    private String saas_customer_type;
    @ExcelProperty("发货类型")
    private String postmode;
    @ExcelProperty("门店品牌属性")
    private String channelCtg;
    @ExcelProperty("内部增值")
    private String bslogamount;
    @ExcelProperty("内部加价人员")
    private String innerPeople;

    @ExcelProperty("销售时间")
    private String pf_close_tm;

    @ExcelProperty("门店品牌")
    private String storeBrand;
    @ExcelProperty("是否AI价")
    private String use_ai_price;
    @ExcelProperty("收货单位")
    private String RCP_ORGID;
    @ExcelProperty("回收单类型")
    private String ppe_recycle_type;
    @ExcelProperty("机型属性")
    private String PRDPROPERTY;
    @ExcelProperty("审单等级")
    private String SD_LEVEL;


    @ExcelProperty("奖励转赠")
    private String PRICE_PROMOTION_B2C;
    @ExcelProperty("内部增值")
    private String PRICE_PROMOTION_SH;
    @ExcelProperty("活动增值")
    private String PRICE_PROMOTION_C1;
    @ExcelProperty("销售支撑")
    private String DEF_SALES_ADD_PRICE;
    @ExcelProperty("用户名称")
    private String ba_create_username;
    @ExcelProperty("用户手机")
    private String ba_mobile;
    @ExcelProperty("订单类型")
    private String SYS_ORDERTYPE_VALUE;


    public String getCREATETM() {
        return CREATETM;
    }

    public void setCREATETM(String CREATETM) {
        this.CREATETM = CREATETM;
    }

    public String getMONTH() {
        return MONTH;
    }

    public void setMONTH(String MONTH) {
        this.MONTH = MONTH;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report210 report210 = (Report210) o;
        String s = "";

        Map<String, String> annoNameMap = new HashMap<>();
        Field[] declaredFields = o.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            ExcelProperty annotation = field.getAnnotation(ExcelProperty.class);
            String[] value = annotation.value();
            annoNameMap.put("get" + field.getName().toLowerCase(), Arrays.asList(value).stream().collect(Collectors.joining(",")));
        }

        Method[] declaredMethods = o.getClass().getDeclaredMethods();
        Method[] declaredMethods1 = this.getClass().getDeclaredMethods();
        Map<String, Method> collect = Arrays.asList(declaredMethods1).stream().collect(Collectors.toMap(Method::getName, d -> d));
        for (Method m : declaredMethods) {
            String name = m.getName();
            if (name.startsWith("get")) {
                try {
                    String descValue = (String) m.invoke(o);
                    Method method = collect.get(name);
                    if (method != null) {
                        String sourceValue = (String) method.invoke(this);
                        if (!Objects.equals(descValue, sourceValue)) {
                            String annoValue = annoNameMap.get(m.getName().toLowerCase());
                            if (!QuickStart.outputStrMap.keySet().contains(annoValue)) {
                                if (!isAnyNull(sourceValue,descValue)){
                                    s += "   原值：" + sourceValue + "   旧值：" + descValue + "   ";
                                    QuickStart.outputStrMap.put(annoValue, "条码：" + getPRDDETAILCODE() + s);
                                    break;
                                }
                            }

                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
//        if (StringUtils.isNotBlank(s)){
//            System.out.println("订单编号：" + getOrderCode() + s);
//            return false;
//        }
        return false;
    }

    private boolean isAllNull(String sourceValue, String descValue) {
        boolean one = sourceValue == null || sourceValue.equals("0")  || sourceValue.equals("null") || sourceValue.equals("0.0%");
        boolean two = descValue == null || descValue.equals("0")  || descValue.equals("null") || descValue.equals("0.0%");
        return one && two;
    }

    private boolean isAnyNull(String sourceValue, String descValue) {
        boolean one = sourceValue == null || sourceValue.equals("0")  || sourceValue.equals("null") || sourceValue.equals("0.0%");
        boolean two = descValue == null || descValue.equals("0")  || descValue.equals("null") || descValue.equals("0.0%");
        return one || two;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderCode, CREATETM, MONTH, PAYTM, INTM2, CREATETM_D, PAYTM_D, INTM2_D, CREATMOTH, CLOSEBATCH, WEEK, ORGID, ORGNAME, LOCALNAME, CHANNELNAME1, CBCL2NAME, CBCL3NAME, CL11NAME, CBCL4NAME, CHANNELNAME2, CL31NAME, CHANNELNAME4, CHANNELNAME, orderFlowType, ustomer_name, PRDDETAILID, PRDDETAILCODE, CTGNAME0, CTGNAME1, CTGNAME, PRDNAME, CHECKLEVEL, PRD_DESC, IMEI, NUM, PRICE_O, PRICE_C, PRICE, AVG_PRICE, PRICE_T, SAL_NUM, SALEPRICE, AVG_SD_PRICE, SALE_CB, PROFT, PROFT_RATE, PROFT_CHECK, PROFT_CHECK_RATE, DIFFPRICE, SALES_RAX, SALES_PLAT, SALES_OTHER, CHECK_PRICE, REPAIR_PRICE, PRICE_EXPRESS, SALES_ALL, PRICE_PT, PRICE_C4, PRICE_C5, PAY_PN, SALES_PAY, PRICE_C3, DZ_PAY, PAY_B3, PAY_YJ, PAY_YJ_PRE, PRICE_ALL, PRICE_SALE, sales_rate, PAY_ZHML, PAY_ZHLL, AVG_ML_PRICE, profit_all, MLQK, PAY_QDCB, CHANNEL_RATE, BACKEND_CB, BACKEND_CB_RATE, PRICE_DOWN_MODEL, PRICE_DOWN_AI, PRICE_DOWN_MODEL_RATE, PRICE_DOWN_AI_RATE, DEF_PRD_PRICE, DEF_BACK_PRICE, DEF_DOWN_PRICE, DEF_ERROR_PRICE, DEF_CHANNEL_PRICE, DEF_PROM_PRICE, DEF_CHANELADD_PRICE, DEF_PRD_PRICE_ADD, DEF_BACK_PRICE_ADD, DEF_DOWN_PRICE_ADD, DEF_ERROR_PRICE_ADD, DEF_CHANNEL_PRICE_ADD, DEF_PRD_PRICE_RATE, DEF_BACK_PRICE_RATE, DEF_DOWN_PRICE_RATE, DEF_ERROR_PRICE_RATE, DEF_CHANNEL_PRICE_RATE, GH_SALE_ML, GH_CHANNEL_CB, GH_ERROR_CB, GH_BACKEND_CB, GH_DOWN_PRICE, GH_PROFIT, MODEL_PRICE, AI_PRICE, PAIJTANG_PRICE, CLERRORLEVEL, ORDERSTATUSNAME, PRDFINSTATUS, INVSTATUSNAME, INLOCALTM, CHECKUSERNAME, CHECK_MAIN, CHECK_DETAIL, DETAIL_M, DETAIL_S, DETAIL_CY, SALESNAME, SMOBILE, MEMBERNAME, MOBILE, ADDR_PROVINCE, ADDR_CITY, ADDR_AREA, partnercode, WAYBILLNO, POSTCOMPNAME, price_stage, CHANNELID, CHECK_NAME2, CHECK_MAIN2, CHECK_DETAIL2, PRICE_FRONT, STORE_DAY, PRICE_JS, postTime, actname, memberMobile, memberId, appeal_price, supply_price, prd_price, appealstatus, appealOptions, channelpricename, price_type, SALES_COMP_COUNT, remark, price_error_adjust_rate_shop, price_error_adjust_rate, channel_reward_rate, DEPARTMENTID, CL3NAME, CL32NAME, EXPRESS_NUMBER, p_config_inquiry_price_tmp_type, verify_price, checktype, NC, PURCHASE_TYPE, countORDERCODE, order_page_type, PAYTM_Y, FINCNAME, INTM, saas_customer_type, postmode, channelCtg, bslogamount, innerPeople, pf_close_tm, storeBrand, use_ai_price, RCP_ORGID, ppe_recycle_type, PRDPROPERTY, SD_LEVEL, PRICE_PROMOTION_B2C, PRICE_PROMOTION_SH, PRICE_PROMOTION_C1, DEF_SALES_ADD_PRICE, ba_create_username, ba_mobile, SYS_ORDERTYPE_VALUE);
    }

    @Override
    public String toString() {
        return "Report210{" +
                "orderCode='" + orderCode + '\'' +
                ", CREATETM='" + CREATETM + '\'' +
                ", MONTH='" + MONTH + '\'' +
                ", PAYTM='" + PAYTM + '\'' +
                ", INTM2='" + INTM2 + '\'' +
                ", CREATETM_D='" + CREATETM_D + '\'' +
                ", PAYTM_D='" + PAYTM_D + '\'' +
                ", INTM2_D='" + INTM2_D + '\'' +
                ", CREATMOTH='" + CREATMOTH + '\'' +
                ", CLOSEBATCH='" + CLOSEBATCH + '\'' +
                ", WEEK='" + WEEK + '\'' +
                ", ORGID='" + ORGID + '\'' +
                ", ORGNAME='" + ORGNAME + '\'' +
                ", LOCALNAME='" + LOCALNAME + '\'' +
                ", CHANNELNAME1='" + CHANNELNAME1 + '\'' +
                ", CBCL2NAME='" + CBCL2NAME + '\'' +
                ", CBCL3NAME='" + CBCL3NAME + '\'' +
                ", CL11NAME='" + CL11NAME + '\'' +
                ", CBCL4NAME='" + CBCL4NAME + '\'' +
                ", CHANNELNAME2='" + CHANNELNAME2 + '\'' +
                ", CL31NAME='" + CL31NAME + '\'' +
                ", CHANNELNAME4='" + CHANNELNAME4 + '\'' +
                ", CHANNELNAME='" + CHANNELNAME + '\'' +
                ", orderFlowType='" + orderFlowType + '\'' +
                ", ustomer_name='" + ustomer_name + '\'' +
                ", PRDDETAILID='" + PRDDETAILID + '\'' +
                ", PRDDETAILCODE='" + PRDDETAILCODE + '\'' +
                ", CTGNAME0='" + CTGNAME0 + '\'' +
                ", CTGNAME1='" + CTGNAME1 + '\'' +
                ", CTGNAME='" + CTGNAME + '\'' +
                ", PRDNAME='" + PRDNAME + '\'' +
                ", CHECKLEVEL='" + CHECKLEVEL + '\'' +
                ", PRD_DESC='" + PRD_DESC + '\'' +
                ", IMEI='" + IMEI + '\'' +
                ", NUM='" + NUM + '\'' +
                ", PRICE_O='" + PRICE_O + '\'' +
                ", PRICE_C='" + PRICE_C + '\'' +
                ", PRICE='" + PRICE + '\'' +
                ", AVG_PRICE='" + AVG_PRICE + '\'' +
                ", PRICE_T='" + PRICE_T + '\'' +
                ", SAL_NUM='" + SAL_NUM + '\'' +
                ", SALEPRICE='" + SALEPRICE + '\'' +
                ", AVG_SD_PRICE='" + AVG_SD_PRICE + '\'' +
                ", SALE_CB='" + SALE_CB + '\'' +
                ", PROFT='" + PROFT + '\'' +
                ", PROFT_RATE='" + PROFT_RATE + '\'' +
                ", PROFT_CHECK='" + PROFT_CHECK + '\'' +
                ", PROFT_CHECK_RATE='" + PROFT_CHECK_RATE + '\'' +
                ", DIFFPRICE='" + DIFFPRICE + '\'' +
                ", SALES_RAX='" + SALES_RAX + '\'' +
                ", SALES_PLAT='" + SALES_PLAT + '\'' +
                ", SALES_OTHER='" + SALES_OTHER + '\'' +
                ", CHECK_PRICE='" + CHECK_PRICE + '\'' +
                ", REPAIR_PRICE='" + REPAIR_PRICE + '\'' +
                ", PRICE_EXPRESS='" + PRICE_EXPRESS + '\'' +
                ", SALES_ALL='" + SALES_ALL + '\'' +
                ", PRICE_PT='" + PRICE_PT + '\'' +
                ", PRICE_C4='" + PRICE_C4 + '\'' +
                ", PRICE_C5='" + PRICE_C5 + '\'' +
                ", PAY_PN='" + PAY_PN + '\'' +
                ", SALES_PAY='" + SALES_PAY + '\'' +
                ", PRICE_C3='" + PRICE_C3 + '\'' +
                ", DZ_PAY='" + DZ_PAY + '\'' +
                ", PAY_B3='" + PAY_B3 + '\'' +
                ", PAY_YJ='" + PAY_YJ + '\'' +
                ", PAY_YJ_PRE='" + PAY_YJ_PRE + '\'' +
                ", PRICE_ALL='" + PRICE_ALL + '\'' +
                ", PRICE_SALE='" + PRICE_SALE + '\'' +
                ", sales_rate='" + sales_rate + '\'' +
                ", PAY_ZHML='" + PAY_ZHML + '\'' +
                ", PAY_ZHLL='" + PAY_ZHLL + '\'' +
                ", AVG_ML_PRICE='" + AVG_ML_PRICE + '\'' +
                ", profit_all='" + profit_all + '\'' +
                ", MLQK='" + MLQK + '\'' +
                ", PAY_QDCB='" + PAY_QDCB + '\'' +
                ", CHANNEL_RATE='" + CHANNEL_RATE + '\'' +
                ", BACKEND_CB='" + BACKEND_CB + '\'' +
                ", BACKEND_CB_RATE='" + BACKEND_CB_RATE + '\'' +
                ", PRICE_DOWN_MODEL='" + PRICE_DOWN_MODEL + '\'' +
                ", PRICE_DOWN_AI='" + PRICE_DOWN_AI + '\'' +
                ", PRICE_DOWN_MODEL_RATE='" + PRICE_DOWN_MODEL_RATE + '\'' +
                ", PRICE_DOWN_AI_RATE='" + PRICE_DOWN_AI_RATE + '\'' +
                ", DEF_PRD_PRICE='" + DEF_PRD_PRICE + '\'' +
                ", DEF_BACK_PRICE='" + DEF_BACK_PRICE + '\'' +
                ", DEF_DOWN_PRICE='" + DEF_DOWN_PRICE + '\'' +
                ", DEF_ERROR_PRICE='" + DEF_ERROR_PRICE + '\'' +
                ", DEF_CHANNEL_PRICE='" + DEF_CHANNEL_PRICE + '\'' +
                ", DEF_PROM_PRICE='" + DEF_PROM_PRICE + '\'' +
                ", DEF_CHANELADD_PRICE='" + DEF_CHANELADD_PRICE + '\'' +
                ", DEF_PRD_PRICE_ADD='" + DEF_PRD_PRICE_ADD + '\'' +
                ", DEF_BACK_PRICE_ADD='" + DEF_BACK_PRICE_ADD + '\'' +
                ", DEF_DOWN_PRICE_ADD='" + DEF_DOWN_PRICE_ADD + '\'' +
                ", DEF_ERROR_PRICE_ADD='" + DEF_ERROR_PRICE_ADD + '\'' +
                ", DEF_CHANNEL_PRICE_ADD='" + DEF_CHANNEL_PRICE_ADD + '\'' +
                ", DEF_PRD_PRICE_RATE='" + DEF_PRD_PRICE_RATE + '\'' +
                ", DEF_BACK_PRICE_RATE='" + DEF_BACK_PRICE_RATE + '\'' +
                ", DEF_DOWN_PRICE_RATE='" + DEF_DOWN_PRICE_RATE + '\'' +
                ", DEF_ERROR_PRICE_RATE='" + DEF_ERROR_PRICE_RATE + '\'' +
                ", DEF_CHANNEL_PRICE_RATE='" + DEF_CHANNEL_PRICE_RATE + '\'' +
                ", GH_SALE_ML='" + GH_SALE_ML + '\'' +
                ", GH_CHANNEL_CB='" + GH_CHANNEL_CB + '\'' +
                ", GH_ERROR_CB='" + GH_ERROR_CB + '\'' +
                ", GH_BACKEND_CB='" + GH_BACKEND_CB + '\'' +
                ", GH_DOWN_PRICE='" + GH_DOWN_PRICE + '\'' +
                ", GH_PROFIT='" + GH_PROFIT + '\'' +
                ", MODEL_PRICE='" + MODEL_PRICE + '\'' +
                ", AI_PRICE='" + AI_PRICE + '\'' +
                ", PAIJTANG_PRICE='" + PAIJTANG_PRICE + '\'' +
                ", CLERRORLEVEL='" + CLERRORLEVEL + '\'' +
                ", ORDERSTATUSNAME='" + ORDERSTATUSNAME + '\'' +
                ", PRDFINSTATUS='" + PRDFINSTATUS + '\'' +
                ", INVSTATUSNAME='" + INVSTATUSNAME + '\'' +
                ", INLOCALTM='" + INLOCALTM + '\'' +
                ", CHECKUSERNAME='" + CHECKUSERNAME + '\'' +
                ", CHECK_MAIN='" + CHECK_MAIN + '\'' +
                ", CHECK_DETAIL='" + CHECK_DETAIL + '\'' +
                ", DETAIL_M='" + DETAIL_M + '\'' +
                ", DETAIL_S='" + DETAIL_S + '\'' +
                ", DETAIL_CY='" + DETAIL_CY + '\'' +
                ", SALESNAME='" + SALESNAME + '\'' +
                ", SMOBILE='" + SMOBILE + '\'' +
                ", MEMBERNAME='" + MEMBERNAME + '\'' +
                ", MOBILE='" + MOBILE + '\'' +
                ", ADDR_PROVINCE='" + ADDR_PROVINCE + '\'' +
                ", ADDR_CITY='" + ADDR_CITY + '\'' +
                ", ADDR_AREA='" + ADDR_AREA + '\'' +
                ", partnercode='" + partnercode + '\'' +
                ", WAYBILLNO='" + WAYBILLNO + '\'' +
                ", POSTCOMPNAME='" + POSTCOMPNAME + '\'' +
                ", price_stage='" + price_stage + '\'' +
                ", CHANNELID='" + CHANNELID + '\'' +
                ", CHECK_NAME2='" + CHECK_NAME2 + '\'' +
                ", CHECK_MAIN2='" + CHECK_MAIN2 + '\'' +
                ", CHECK_DETAIL2='" + CHECK_DETAIL2 + '\'' +
                ", PRICE_FRONT='" + PRICE_FRONT + '\'' +
                ", STORE_DAY='" + STORE_DAY + '\'' +
                ", PRICE_JS='" + PRICE_JS + '\'' +
                ", postTime='" + postTime + '\'' +
                ", actname='" + actname + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                ", memberId='" + memberId + '\'' +
                ", appeal_price='" + appeal_price + '\'' +
                ", supply_price='" + supply_price + '\'' +
                ", prd_price='" + prd_price + '\'' +
                ", appealstatus='" + appealstatus + '\'' +
                ", appealOptions='" + appealOptions + '\'' +
                ", channelpricename='" + channelpricename + '\'' +
                ", price_type='" + price_type + '\'' +
                ", SALES_COMP_COUNT='" + SALES_COMP_COUNT + '\'' +
                ", remark='" + remark + '\'' +
                ", price_error_adjust_rate_shop='" + price_error_adjust_rate_shop + '\'' +
                ", price_error_adjust_rate='" + price_error_adjust_rate + '\'' +
                ", channel_reward_rate='" + channel_reward_rate + '\'' +
                ", DEPARTMENTID='" + DEPARTMENTID + '\'' +
                ", CL3NAME='" + CL3NAME + '\'' +
                ", CL32NAME='" + CL32NAME + '\'' +
                ", EXPRESS_NUMBER='" + EXPRESS_NUMBER + '\'' +
                ", p_config_inquiry_price_tmp_type='" + p_config_inquiry_price_tmp_type + '\'' +
                ", verify_price='" + verify_price + '\'' +
                ", checktype='" + checktype + '\'' +
                ", NC='" + NC + '\'' +
                ", PURCHASE_TYPE='" + PURCHASE_TYPE + '\'' +
                ", countORDERCODE='" + countORDERCODE + '\'' +
                ", order_page_type='" + order_page_type + '\'' +
                ", PAYTM_Y='" + PAYTM_Y + '\'' +
                ", FINCNAME='" + FINCNAME + '\'' +
                ", INTM='" + INTM + '\'' +
                ", saas_customer_type='" + saas_customer_type + '\'' +
                ", postmode='" + postmode + '\'' +
                ", channelCtg='" + channelCtg + '\'' +
                ", bslogamount='" + bslogamount + '\'' +
                ", innerPeople='" + innerPeople + '\'' +
                ", pf_close_tm='" + pf_close_tm + '\'' +
                ", storeBrand='" + storeBrand + '\'' +
                ", use_ai_price='" + use_ai_price + '\'' +
                ", RCP_ORGID='" + RCP_ORGID + '\'' +
                ", ppe_recycle_type='" + ppe_recycle_type + '\'' +
                ", PRDPROPERTY='" + PRDPROPERTY + '\'' +
                ", SD_LEVEL='" + SD_LEVEL + '\'' +
                ", PRICE_PROMOTION_B2C='" + PRICE_PROMOTION_B2C + '\'' +
                ", PRICE_PROMOTION_SH='" + PRICE_PROMOTION_SH + '\'' +
                ", PRICE_PROMOTION_C1='" + PRICE_PROMOTION_C1 + '\'' +
                ", DEF_SALES_ADD_PRICE='" + DEF_SALES_ADD_PRICE + '\'' +
                ", ba_create_username='" + ba_create_username + '\'' +
                ", ba_mobile='" + ba_mobile + '\'' +
                ", SYS_ORDERTYPE_VALUE='" + SYS_ORDERTYPE_VALUE + '\'' +
                '}';
    }

    public String getPAYTM() {
        return PAYTM;
    }

    public void setPAYTM(String PAYTM) {
        this.PAYTM = PAYTM;
    }

    public String getINTM2() {
        return INTM2;
    }

    public void setINTM2(String INTM2) {
        this.INTM2 = INTM2;
    }

    public String getCREATETM_D() {
        return CREATETM_D;
    }

    public void setCREATETM_D(String CREATETM_D) {
        this.CREATETM_D = CREATETM_D;
    }

    public String getPAYTM_D() {
        return PAYTM_D;
    }

    public void setPAYTM_D(String PAYTM_D) {
        this.PAYTM_D = PAYTM_D;
    }

    public String getINTM2_D() {
        return INTM2_D;
    }

    public void setINTM2_D(String INTM2_D) {
        this.INTM2_D = INTM2_D;
    }

    public String getCREATMOTH() {
        return CREATMOTH;
    }

    public void setCREATMOTH(String CREATMOTH) {
        this.CREATMOTH = CREATMOTH;
    }

    public String getCLOSEBATCH() {
        return CLOSEBATCH;
    }

    public void setCLOSEBATCH(String CLOSEBATCH) {
        this.CLOSEBATCH = CLOSEBATCH;
    }

    public String getWEEK() {
        return WEEK;
    }

    public void setWEEK(String WEEK) {
        this.WEEK = WEEK;
    }

    public String getORGID() {
        return ORGID;
    }

    public void setORGID(String ORGID) {
        this.ORGID = ORGID;
    }

    public String getORGNAME() {
        return ORGNAME;
    }

    public void setORGNAME(String ORGNAME) {
        this.ORGNAME = ORGNAME;
    }

    public String getLOCALNAME() {
        return LOCALNAME;
    }

    public void setLOCALNAME(String LOCALNAME) {
        this.LOCALNAME = LOCALNAME;
    }

    public String getCHANNELNAME1() {
        return CHANNELNAME1;
    }

    public void setCHANNELNAME1(String CHANNELNAME1) {
        this.CHANNELNAME1 = CHANNELNAME1;
    }

    public String getCBCL2NAME() {
        return CBCL2NAME;
    }

    public void setCBCL2NAME(String CBCL2NAME) {
        this.CBCL2NAME = CBCL2NAME;
    }

    public String getCBCL3NAME() {
        return CBCL3NAME;
    }

    public void setCBCL3NAME(String CBCL3NAME) {
        this.CBCL3NAME = CBCL3NAME;
    }

    public String getCL11NAME() {
        return CL11NAME;
    }

    public void setCL11NAME(String CL11NAME) {
        this.CL11NAME = CL11NAME;
    }

    public String getCBCL4NAME() {
        return CBCL4NAME;
    }

    public void setCBCL4NAME(String CBCL4NAME) {
        this.CBCL4NAME = CBCL4NAME;
    }

    public String getCHANNELNAME2() {
        return CHANNELNAME2;
    }

    public void setCHANNELNAME2(String CHANNELNAME2) {
        this.CHANNELNAME2 = CHANNELNAME2;
    }

    public String getCL31NAME() {
        return CL31NAME;
    }

    public void setCL31NAME(String CL31NAME) {
        this.CL31NAME = CL31NAME;
    }

    public String getCHANNELNAME4() {
        return CHANNELNAME4;
    }

    public void setCHANNELNAME4(String CHANNELNAME4) {
        this.CHANNELNAME4 = CHANNELNAME4;
    }

    public String getCHANNELNAME() {
        return CHANNELNAME;
    }

    public void setCHANNELNAME(String CHANNELNAME) {
        this.CHANNELNAME = CHANNELNAME;
    }

    public String getOrderFlowType() {
        return orderFlowType;
    }

    public void setOrderFlowType(String orderFlowType) {
        this.orderFlowType = orderFlowType;
    }

    public String getUstomer_name() {
        return ustomer_name;
    }

    public void setUstomer_name(String ustomer_name) {
        this.ustomer_name = ustomer_name;
    }

    public String getPRDDETAILID() {
        return PRDDETAILID;
    }

    public void setPRDDETAILID(String PRDDETAILID) {
        this.PRDDETAILID = PRDDETAILID;
    }

    public String getPRDDETAILCODE() {
        return PRDDETAILCODE;
    }

    public void setPRDDETAILCODE(String PRDDETAILCODE) {
        this.PRDDETAILCODE = PRDDETAILCODE;
    }

    public String getCTGNAME0() {
        return CTGNAME0;
    }

    public void setCTGNAME0(String CTGNAME0) {
        this.CTGNAME0 = CTGNAME0;
    }

    public String getCTGNAME1() {
        return CTGNAME1;
    }

    public void setCTGNAME1(String CTGNAME1) {
        this.CTGNAME1 = CTGNAME1;
    }

    public String getCTGNAME() {
        return CTGNAME;
    }

    public void setCTGNAME(String CTGNAME) {
        this.CTGNAME = CTGNAME;
    }

    public String getPRDNAME() {
        return PRDNAME;
    }

    public void setPRDNAME(String PRDNAME) {
        this.PRDNAME = PRDNAME;
    }

    public String getCHECKLEVEL() {
        return CHECKLEVEL;
    }

    public void setCHECKLEVEL(String CHECKLEVEL) {
        this.CHECKLEVEL = CHECKLEVEL;
    }

//    public String getERROR_MAIN() {
//        return ERROR_MAIN;
//    }
//
//    public void setERROR_MAIN(String ERROR_MAIN) {
//        this.ERROR_MAIN = ERROR_MAIN;
//    }

    public String getPRD_DESC() {
        return PRD_DESC;
    }

    public void setPRD_DESC(String PRD_DESC) {
        this.PRD_DESC = PRD_DESC;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getNUM() {
        return NUM;
    }

    public void setNUM(String NUM) {
        this.NUM = NUM;
    }

    public String getPRICE_O() {
        return PRICE_O;
    }

    public void setPRICE_O(String PRICE_O) {
        this.PRICE_O = PRICE_O;
    }

    public String getPRICE_C() {
        return PRICE_C;
    }

    public void setPRICE_C(String PRICE_C) {
        this.PRICE_C = PRICE_C;
    }

    public String getPRICE() {
        return PRICE;
    }

    public void setPRICE(String PRICE) {
        this.PRICE = PRICE;
    }

    public String getAVG_PRICE() {
        return AVG_PRICE;
    }

    public void setAVG_PRICE(String AVG_PRICE) {
        this.AVG_PRICE = AVG_PRICE;
    }

    public String getPRICE_T() {
        return PRICE_T;
    }

    public void setPRICE_T(String PRICE_T) {
        this.PRICE_T = PRICE_T;
    }

    public String getSAL_NUM() {
        return SAL_NUM;
    }

    public void setSAL_NUM(String SAL_NUM) {
        this.SAL_NUM = SAL_NUM;
    }

    public String getSALEPRICE() {
        return SALEPRICE;
    }

    public void setSALEPRICE(String SALEPRICE) {
        this.SALEPRICE = SALEPRICE;
    }

    public String getAVG_SD_PRICE() {
        return AVG_SD_PRICE;
    }

    public void setAVG_SD_PRICE(String AVG_SD_PRICE) {
        this.AVG_SD_PRICE = AVG_SD_PRICE;
    }

    public String getSALE_CB() {
        return SALE_CB;
    }

    public void setSALE_CB(String SALE_CB) {
        this.SALE_CB = SALE_CB;
    }

    public String getPROFT() {
        return PROFT;
    }

    public void setPROFT(String PROFT) {
        this.PROFT = PROFT;
    }

    public String getPROFT_RATE() {
        return PROFT_RATE;
    }

    public void setPROFT_RATE(String PROFT_RATE) {
        this.PROFT_RATE = PROFT_RATE;
    }

    public String getPROFT_CHECK() {
        return PROFT_CHECK;
    }

    public void setPROFT_CHECK(String PROFT_CHECK) {
        this.PROFT_CHECK = PROFT_CHECK;
    }

    public String getPROFT_CHECK_RATE() {
        return PROFT_CHECK_RATE;
    }

    public void setPROFT_CHECK_RATE(String PROFT_CHECK_RATE) {
        this.PROFT_CHECK_RATE = PROFT_CHECK_RATE;
    }

    public String getDIFFPRICE() {
        return DIFFPRICE;
    }

    public void setDIFFPRICE(String DIFFPRICE) {
        this.DIFFPRICE = DIFFPRICE;
    }

    public String getSALES_RAX() {
        return SALES_RAX;
    }

    public void setSALES_RAX(String SALES_RAX) {
        this.SALES_RAX = SALES_RAX;
    }

    public String getSALES_PLAT() {
        return SALES_PLAT;
    }

    public void setSALES_PLAT(String SALES_PLAT) {
        this.SALES_PLAT = SALES_PLAT;
    }

    public String getSALES_OTHER() {
        return SALES_OTHER;
    }

    public void setSALES_OTHER(String SALES_OTHER) {
        this.SALES_OTHER = SALES_OTHER;
    }

    public String getCHECK_PRICE() {
        return CHECK_PRICE;
    }

    public void setCHECK_PRICE(String CHECK_PRICE) {
        this.CHECK_PRICE = CHECK_PRICE;
    }

    public String getREPAIR_PRICE() {
        return REPAIR_PRICE;
    }

    public void setREPAIR_PRICE(String REPAIR_PRICE) {
        this.REPAIR_PRICE = REPAIR_PRICE;
    }

    public String getPRICE_EXPRESS() {
        return PRICE_EXPRESS;
    }

    public void setPRICE_EXPRESS(String PRICE_EXPRESS) {
        this.PRICE_EXPRESS = PRICE_EXPRESS;
    }

    public String getSALES_ALL() {
        return SALES_ALL;
    }

    public void setSALES_ALL(String SALES_ALL) {
        this.SALES_ALL = SALES_ALL;
    }

    public String getPRICE_PT() {
        return PRICE_PT;
    }

    public void setPRICE_PT(String PRICE_PT) {
        this.PRICE_PT = PRICE_PT;
    }

    public String getPRICE_C4() {
        return PRICE_C4;
    }

    public void setPRICE_C4(String PRICE_C4) {
        this.PRICE_C4 = PRICE_C4;
    }

    public String getPRICE_C5() {
        return PRICE_C5;
    }

    public void setPRICE_C5(String PRICE_C5) {
        this.PRICE_C5 = PRICE_C5;
    }

    public String getPAY_PN() {
        return PAY_PN;
    }

    public void setPAY_PN(String PAY_PN) {
        this.PAY_PN = PAY_PN;
    }

    public String getSALES_PAY() {
        return SALES_PAY;
    }

    public void setSALES_PAY(String SALES_PAY) {
        this.SALES_PAY = SALES_PAY;
    }

    public String getPRICE_C3() {
        return PRICE_C3;
    }

    public void setPRICE_C3(String PRICE_C3) {
        this.PRICE_C3 = PRICE_C3;
    }

    public String getDZ_PAY() {
        return DZ_PAY;
    }

    public void setDZ_PAY(String DZ_PAY) {
        this.DZ_PAY = DZ_PAY;
    }

    public String getPAY_B3() {
        return PAY_B3;
    }

    public void setPAY_B3(String PAY_B3) {
        this.PAY_B3 = PAY_B3;
    }

    public String getPAY_YJ() {
        return PAY_YJ;
    }

    public void setPAY_YJ(String PAY_YJ) {
        this.PAY_YJ = PAY_YJ;
    }

    public String getPAY_YJ_PRE() {
        return PAY_YJ_PRE;
    }

    public void setPAY_YJ_PRE(String PAY_YJ_PRE) {
        this.PAY_YJ_PRE = PAY_YJ_PRE;
    }

    public String getPRICE_ALL() {
        return PRICE_ALL;
    }

    public void setPRICE_ALL(String PRICE_ALL) {
        this.PRICE_ALL = PRICE_ALL;
    }

    public String getPRICE_SALE() {
        return PRICE_SALE;
    }

    public void setPRICE_SALE(String PRICE_SALE) {
        this.PRICE_SALE = PRICE_SALE;
    }

    public String getSales_rate() {
        return sales_rate;
    }

    public void setSales_rate(String sales_rate) {
        this.sales_rate = sales_rate;
    }

    public String getPAY_ZHML() {
        return PAY_ZHML;
    }

    public void setPAY_ZHML(String PAY_ZHML) {
        this.PAY_ZHML = PAY_ZHML;
    }

    public String getPAY_ZHLL() {
        return PAY_ZHLL;
    }

    public void setPAY_ZHLL(String PAY_ZHLL) {
        this.PAY_ZHLL = PAY_ZHLL;
    }

    public String getAVG_ML_PRICE() {
        return AVG_ML_PRICE;
    }

    public void setAVG_ML_PRICE(String AVG_ML_PRICE) {
        this.AVG_ML_PRICE = AVG_ML_PRICE;
    }

    public String getProfit_all() {
        return profit_all;
    }

    public void setProfit_all(String profit_all) {
        this.profit_all = profit_all;
    }

    public String getMLQK() {
        return MLQK;
    }

    public void setMLQK(String MLQK) {
        this.MLQK = MLQK;
    }

    public String getPAY_QDCB() {
        return PAY_QDCB;
    }

    public void setPAY_QDCB(String PAY_QDCB) {
        this.PAY_QDCB = PAY_QDCB;
    }

    public String getCHANNEL_RATE() {
        return CHANNEL_RATE;
    }

    public void setCHANNEL_RATE(String CHANNEL_RATE) {
        this.CHANNEL_RATE = CHANNEL_RATE;
    }

    public String getBACKEND_CB() {
        return BACKEND_CB;
    }

    public void setBACKEND_CB(String BACKEND_CB) {
        this.BACKEND_CB = BACKEND_CB;
    }

    public String getBACKEND_CB_RATE() {
        return BACKEND_CB_RATE;
    }

    public void setBACKEND_CB_RATE(String BACKEND_CB_RATE) {
        this.BACKEND_CB_RATE = BACKEND_CB_RATE;
    }

    public String getPRICE_DOWN_MODEL() {
        return PRICE_DOWN_MODEL;
    }

    public void setPRICE_DOWN_MODEL(String PRICE_DOWN_MODEL) {
        this.PRICE_DOWN_MODEL = PRICE_DOWN_MODEL;
    }

    public String getPRICE_DOWN_AI() {
        return PRICE_DOWN_AI;
    }

    public void setPRICE_DOWN_AI(String PRICE_DOWN_AI) {
        this.PRICE_DOWN_AI = PRICE_DOWN_AI;
    }

    public String getPRICE_DOWN_MODEL_RATE() {
        return PRICE_DOWN_MODEL_RATE;
    }

    public void setPRICE_DOWN_MODEL_RATE(String PRICE_DOWN_MODEL_RATE) {
        this.PRICE_DOWN_MODEL_RATE = PRICE_DOWN_MODEL_RATE;
    }

    public String getPRICE_DOWN_AI_RATE() {
        return PRICE_DOWN_AI_RATE;
    }

    public void setPRICE_DOWN_AI_RATE(String PRICE_DOWN_AI_RATE) {
        this.PRICE_DOWN_AI_RATE = PRICE_DOWN_AI_RATE;
    }

    public String getDEF_PRD_PRICE() {
        return DEF_PRD_PRICE;
    }

    public void setDEF_PRD_PRICE(String DEF_PRD_PRICE) {
        this.DEF_PRD_PRICE = DEF_PRD_PRICE;
    }

    public String getDEF_BACK_PRICE() {
        return DEF_BACK_PRICE;
    }

    public void setDEF_BACK_PRICE(String DEF_BACK_PRICE) {
        this.DEF_BACK_PRICE = DEF_BACK_PRICE;
    }

    public String getDEF_DOWN_PRICE() {
        return DEF_DOWN_PRICE;
    }

    public void setDEF_DOWN_PRICE(String DEF_DOWN_PRICE) {
        this.DEF_DOWN_PRICE = DEF_DOWN_PRICE;
    }

    public String getDEF_ERROR_PRICE() {
        return DEF_ERROR_PRICE;
    }

    public void setDEF_ERROR_PRICE(String DEF_ERROR_PRICE) {
        this.DEF_ERROR_PRICE = DEF_ERROR_PRICE;
    }

    public String getDEF_CHANNEL_PRICE() {
        return DEF_CHANNEL_PRICE;
    }

    public void setDEF_CHANNEL_PRICE(String DEF_CHANNEL_PRICE) {
        this.DEF_CHANNEL_PRICE = DEF_CHANNEL_PRICE;
    }

    public String getDEF_PROM_PRICE() {
        return DEF_PROM_PRICE;
    }

    public void setDEF_PROM_PRICE(String DEF_PROM_PRICE) {
        this.DEF_PROM_PRICE = DEF_PROM_PRICE;
    }

    public String getDEF_CHANELADD_PRICE() {
        return DEF_CHANELADD_PRICE;
    }

    public void setDEF_CHANELADD_PRICE(String DEF_CHANELADD_PRICE) {
        this.DEF_CHANELADD_PRICE = DEF_CHANELADD_PRICE;
    }

    public String getDEF_PRD_PRICE_ADD() {
        return DEF_PRD_PRICE_ADD;
    }

    public void setDEF_PRD_PRICE_ADD(String DEF_PRD_PRICE_ADD) {
        this.DEF_PRD_PRICE_ADD = DEF_PRD_PRICE_ADD;
    }

    public String getDEF_BACK_PRICE_ADD() {
        return DEF_BACK_PRICE_ADD;
    }

    public void setDEF_BACK_PRICE_ADD(String DEF_BACK_PRICE_ADD) {
        this.DEF_BACK_PRICE_ADD = DEF_BACK_PRICE_ADD;
    }

    public String getDEF_DOWN_PRICE_ADD() {
        return DEF_DOWN_PRICE_ADD;
    }

    public void setDEF_DOWN_PRICE_ADD(String DEF_DOWN_PRICE_ADD) {
        this.DEF_DOWN_PRICE_ADD = DEF_DOWN_PRICE_ADD;
    }

    public String getDEF_ERROR_PRICE_ADD() {
        return DEF_ERROR_PRICE_ADD;
    }

    public void setDEF_ERROR_PRICE_ADD(String DEF_ERROR_PRICE_ADD) {
        this.DEF_ERROR_PRICE_ADD = DEF_ERROR_PRICE_ADD;
    }

    public String getDEF_CHANNEL_PRICE_ADD() {
        return DEF_CHANNEL_PRICE_ADD;
    }

    public void setDEF_CHANNEL_PRICE_ADD(String DEF_CHANNEL_PRICE_ADD) {
        this.DEF_CHANNEL_PRICE_ADD = DEF_CHANNEL_PRICE_ADD;
    }

    public String getDEF_PRD_PRICE_RATE() {
        return DEF_PRD_PRICE_RATE;
    }

    public void setDEF_PRD_PRICE_RATE(String DEF_PRD_PRICE_RATE) {
        this.DEF_PRD_PRICE_RATE = DEF_PRD_PRICE_RATE;
    }

    public String getDEF_BACK_PRICE_RATE() {
        return DEF_BACK_PRICE_RATE;
    }

    public void setDEF_BACK_PRICE_RATE(String DEF_BACK_PRICE_RATE) {
        this.DEF_BACK_PRICE_RATE = DEF_BACK_PRICE_RATE;
    }

    public String getDEF_DOWN_PRICE_RATE() {
        return DEF_DOWN_PRICE_RATE;
    }

    public void setDEF_DOWN_PRICE_RATE(String DEF_DOWN_PRICE_RATE) {
        this.DEF_DOWN_PRICE_RATE = DEF_DOWN_PRICE_RATE;
    }

    public String getDEF_ERROR_PRICE_RATE() {
        return DEF_ERROR_PRICE_RATE;
    }

    public void setDEF_ERROR_PRICE_RATE(String DEF_ERROR_PRICE_RATE) {
        this.DEF_ERROR_PRICE_RATE = DEF_ERROR_PRICE_RATE;
    }

    public String getDEF_CHANNEL_PRICE_RATE() {
        return DEF_CHANNEL_PRICE_RATE;
    }

    public void setDEF_CHANNEL_PRICE_RATE(String DEF_CHANNEL_PRICE_RATE) {
        this.DEF_CHANNEL_PRICE_RATE = DEF_CHANNEL_PRICE_RATE;
    }

    public String getGH_SALE_ML() {
        return GH_SALE_ML;
    }

    public void setGH_SALE_ML(String GH_SALE_ML) {
        this.GH_SALE_ML = GH_SALE_ML;
    }

    public String getGH_CHANNEL_CB() {
        return GH_CHANNEL_CB;
    }

    public void setGH_CHANNEL_CB(String GH_CHANNEL_CB) {
        this.GH_CHANNEL_CB = GH_CHANNEL_CB;
    }

    public String getGH_ERROR_CB() {
        return GH_ERROR_CB;
    }

    public void setGH_ERROR_CB(String GH_ERROR_CB) {
        this.GH_ERROR_CB = GH_ERROR_CB;
    }

    public String getGH_BACKEND_CB() {
        return GH_BACKEND_CB;
    }

    public void setGH_BACKEND_CB(String GH_BACKEND_CB) {
        this.GH_BACKEND_CB = GH_BACKEND_CB;
    }

    public String getGH_DOWN_PRICE() {
        return GH_DOWN_PRICE;
    }

    public void setGH_DOWN_PRICE(String GH_DOWN_PRICE) {
        this.GH_DOWN_PRICE = GH_DOWN_PRICE;
    }

    public String getGH_PROFIT() {
        return GH_PROFIT;
    }

    public void setGH_PROFIT(String GH_PROFIT) {
        this.GH_PROFIT = GH_PROFIT;
    }

    public String getMODEL_PRICE() {
        return MODEL_PRICE;
    }

    public void setMODEL_PRICE(String MODEL_PRICE) {
        this.MODEL_PRICE = MODEL_PRICE;
    }

    public String getAI_PRICE() {
        return AI_PRICE;
    }

    public void setAI_PRICE(String AI_PRICE) {
        this.AI_PRICE = AI_PRICE;
    }

    public String getPAIJTANG_PRICE() {
        return PAIJTANG_PRICE;
    }

    public void setPAIJTANG_PRICE(String PAIJTANG_PRICE) {
        this.PAIJTANG_PRICE = PAIJTANG_PRICE;
    }

    public String getCLERRORLEVEL() {
        return CLERRORLEVEL;
    }

    public void setCLERRORLEVEL(String CLERRORLEVEL) {
        this.CLERRORLEVEL = CLERRORLEVEL;
    }

    public String getORDERSTATUSNAME() {
        return ORDERSTATUSNAME;
    }

    public void setORDERSTATUSNAME(String ORDERSTATUSNAME) {
        this.ORDERSTATUSNAME = ORDERSTATUSNAME;
    }

    public String getPRDFINSTATUS() {
        return PRDFINSTATUS;
    }

    public void setPRDFINSTATUS(String PRDFINSTATUS) {
        this.PRDFINSTATUS = PRDFINSTATUS;
    }

    public String getINVSTATUSNAME() {
        return INVSTATUSNAME;
    }

    public void setINVSTATUSNAME(String INVSTATUSNAME) {
        this.INVSTATUSNAME = INVSTATUSNAME;
    }

    public String getINLOCALTM() {
        return INLOCALTM;
    }

    public void setINLOCALTM(String INLOCALTM) {
        this.INLOCALTM = INLOCALTM;
    }

    public String getCHECKUSERNAME() {
        return CHECKUSERNAME;
    }

    public void setCHECKUSERNAME(String CHECKUSERNAME) {
        this.CHECKUSERNAME = CHECKUSERNAME;
    }

    public String getCHECK_MAIN() {
        return CHECK_MAIN;
    }

    public void setCHECK_MAIN(String CHECK_MAIN) {
        this.CHECK_MAIN = CHECK_MAIN;
    }

    public String getCHECK_DETAIL() {
        return CHECK_DETAIL;
    }

    public void setCHECK_DETAIL(String CHECK_DETAIL) {
        this.CHECK_DETAIL = CHECK_DETAIL;
    }

    public String getDETAIL_M() {
        return DETAIL_M;
    }

    public void setDETAIL_M(String DETAIL_M) {
        this.DETAIL_M = DETAIL_M;
    }

    public String getDETAIL_S() {
        return DETAIL_S;
    }

    public void setDETAIL_S(String DETAIL_S) {
        this.DETAIL_S = DETAIL_S;
    }

    public String getDETAIL_CY() {
        return DETAIL_CY;
    }

    public void setDETAIL_CY(String DETAIL_CY) {
        this.DETAIL_CY = DETAIL_CY;
    }

    public String getSALESNAME() {
        return SALESNAME;
    }

    public void setSALESNAME(String SALESNAME) {
        this.SALESNAME = SALESNAME;
    }

    public String getSMOBILE() {
        return SMOBILE;
    }

    public void setSMOBILE(String SMOBILE) {
        this.SMOBILE = SMOBILE;
    }

    public String getMEMBERNAME() {
        return MEMBERNAME;
    }

    public void setMEMBERNAME(String MEMBERNAME) {
        this.MEMBERNAME = MEMBERNAME;
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }

    public String getADDR_PROVINCE() {
        return ADDR_PROVINCE;
    }

    public void setADDR_PROVINCE(String ADDR_PROVINCE) {
        this.ADDR_PROVINCE = ADDR_PROVINCE;
    }

    public String getADDR_CITY() {
        return ADDR_CITY;
    }

    public void setADDR_CITY(String ADDR_CITY) {
        this.ADDR_CITY = ADDR_CITY;
    }

    public String getADDR_AREA() {
        return ADDR_AREA;
    }

    public void setADDR_AREA(String ADDR_AREA) {
        this.ADDR_AREA = ADDR_AREA;
    }

    public String getPartnercode() {
        return partnercode;
    }

    public void setPartnercode(String partnercode) {
        this.partnercode = partnercode;
    }

    public String getWAYBILLNO() {
        return WAYBILLNO;
    }

    public void setWAYBILLNO(String WAYBILLNO) {
        this.WAYBILLNO = WAYBILLNO;
    }

    public String getPOSTCOMPNAME() {
        return POSTCOMPNAME;
    }

    public void setPOSTCOMPNAME(String POSTCOMPNAME) {
        this.POSTCOMPNAME = POSTCOMPNAME;
    }

    public String getPrice_stage() {
        return price_stage;
    }

    public void setPrice_stage(String price_stage) {
        this.price_stage = price_stage;
    }

    public String getCHANNELID() {
        return CHANNELID;
    }

    public void setCHANNELID(String CHANNELID) {
        this.CHANNELID = CHANNELID;
    }

    public String getCHECK_NAME2() {
        return CHECK_NAME2;
    }

    public void setCHECK_NAME2(String CHECK_NAME2) {
        this.CHECK_NAME2 = CHECK_NAME2;
    }

    public String getCHECK_MAIN2() {
        return CHECK_MAIN2;
    }

    public void setCHECK_MAIN2(String CHECK_MAIN2) {
        this.CHECK_MAIN2 = CHECK_MAIN2;
    }

    public String getCHECK_DETAIL2() {
        return CHECK_DETAIL2;
    }

    public void setCHECK_DETAIL2(String CHECK_DETAIL2) {
        this.CHECK_DETAIL2 = CHECK_DETAIL2;
    }

    public String getPRICE_FRONT() {
        return PRICE_FRONT;
    }

    public void setPRICE_FRONT(String PRICE_FRONT) {
        this.PRICE_FRONT = PRICE_FRONT;
    }

    public String getSTORE_DAY() {
        return STORE_DAY;
    }

    public void setSTORE_DAY(String STORE_DAY) {
        this.STORE_DAY = STORE_DAY;
    }

    public String getPRICE_JS() {
        return PRICE_JS;
    }

    public void setPRICE_JS(String PRICE_JS) {
        this.PRICE_JS = PRICE_JS;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public String getActname() {
        return actname;
    }

    public void setActname(String actname) {
        this.actname = actname;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getAppeal_price() {
        return appeal_price;
    }

    public void setAppeal_price(String appeal_price) {
        this.appeal_price = appeal_price;
    }

    public String getSupply_price() {
        return supply_price;
    }

    public void setSupply_price(String supply_price) {
        this.supply_price = supply_price;
    }

    public String getPrd_price() {
        return prd_price;
    }

    public void setPrd_price(String prd_price) {
        this.prd_price = prd_price;
    }

    public String getAppealstatus() {
        return appealstatus;
    }

    public void setAppealstatus(String appealstatus) {
        this.appealstatus = appealstatus;
    }

    public String getAppealOptions() {
        return appealOptions;
    }

    public void setAppealOptions(String appealOptions) {
        this.appealOptions = appealOptions;
    }

    public String getChannelpricename() {
        return channelpricename;
    }

    public void setChannelpricename(String channelpricename) {
        this.channelpricename = channelpricename;
    }

    public String getPrice_type() {
        return price_type;
    }

    public void setPrice_type(String price_type) {
        this.price_type = price_type;
    }

    public String getSALES_COMP_COUNT() {
        return SALES_COMP_COUNT;
    }

    public void setSALES_COMP_COUNT(String SALES_COMP_COUNT) {
        this.SALES_COMP_COUNT = SALES_COMP_COUNT;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPrice_error_adjust_rate_shop() {
        return price_error_adjust_rate_shop;
    }

    public void setPrice_error_adjust_rate_shop(String price_error_adjust_rate_shop) {
        this.price_error_adjust_rate_shop = price_error_adjust_rate_shop;
    }

    public String getPrice_error_adjust_rate() {
        return price_error_adjust_rate;
    }

    public void setPrice_error_adjust_rate(String price_error_adjust_rate) {
        this.price_error_adjust_rate = price_error_adjust_rate;
    }

    public String getChannel_reward_rate() {
        return channel_reward_rate;
    }

    public void setChannel_reward_rate(String channel_reward_rate) {
        this.channel_reward_rate = channel_reward_rate;
    }

    public String getDEPARTMENTID() {
        return DEPARTMENTID;
    }

    public void setDEPARTMENTID(String DEPARTMENTID) {
        this.DEPARTMENTID = DEPARTMENTID;
    }

    public String getCL3NAME() {
        return CL3NAME;
    }

    public void setCL3NAME(String CL3NAME) {
        this.CL3NAME = CL3NAME;
    }

    public String getCL32NAME() {
        return CL32NAME;
    }

    public void setCL32NAME(String CL32NAME) {
        this.CL32NAME = CL32NAME;
    }

    public String getEXPRESS_NUMBER() {
        return EXPRESS_NUMBER;
    }

    public void setEXPRESS_NUMBER(String EXPRESS_NUMBER) {
        this.EXPRESS_NUMBER = EXPRESS_NUMBER;
    }

    public String getP_config_inquiry_price_tmp_type() {
        return p_config_inquiry_price_tmp_type;
    }

    public void setP_config_inquiry_price_tmp_type(String p_config_inquiry_price_tmp_type) {
        this.p_config_inquiry_price_tmp_type = p_config_inquiry_price_tmp_type;
    }

    public String getVerify_price() {
        return verify_price;
    }

    public void setVerify_price(String verify_price) {
        this.verify_price = verify_price;
    }

    public String getChecktype() {
        return checktype;
    }

    public void setChecktype(String checktype) {
        this.checktype = checktype;
    }

    public String getNC() {
        return NC;
    }

    public void setNC(String NC) {
        this.NC = NC;
    }

    public String getPURCHASE_TYPE() {
        return PURCHASE_TYPE;
    }

    public void setPURCHASE_TYPE(String PURCHASE_TYPE) {
        this.PURCHASE_TYPE = PURCHASE_TYPE;
    }

    public String getCountORDERCODE() {
        return countORDERCODE;
    }

    public void setCountORDERCODE(String countORDERCODE) {
        this.countORDERCODE = countORDERCODE;
    }

    public String getOrder_page_type() {
        return order_page_type;
    }

    public void setOrder_page_type(String order_page_type) {
        this.order_page_type = order_page_type;
    }

    public String getPAYTM_Y() {
        return PAYTM_Y;
    }

    public void setPAYTM_Y(String PAYTM_Y) {
        this.PAYTM_Y = PAYTM_Y;
    }

    public String getFINCNAME() {
        return FINCNAME;
    }

    public void setFINCNAME(String FINCNAME) {
        this.FINCNAME = FINCNAME;
    }

    public String getINTM() {
        return INTM;
    }

    public void setINTM(String INTM) {
        this.INTM = INTM;
    }

    public String getSaas_customer_type() {
        return saas_customer_type;
    }

    public void setSaas_customer_type(String saas_customer_type) {
        this.saas_customer_type = saas_customer_type;
    }

    public String getPostmode() {
        return postmode;
    }

    public void setPostmode(String postmode) {
        this.postmode = postmode;
    }

    public String getChannelCtg() {
        return channelCtg;
    }

    public void setChannelCtg(String channelCtg) {
        this.channelCtg = channelCtg;
    }

    public String getBslogamount() {
        return bslogamount;
    }

    public void setBslogamount(String bslogamount) {
        this.bslogamount = bslogamount;
    }

    public String getInnerPeople() {
        return innerPeople;
    }

    public void setInnerPeople(String innerPeople) {
        this.innerPeople = innerPeople;
    }

    public String getPf_close_tm() {
        return pf_close_tm;
    }

    public void setPf_close_tm(String pf_close_tm) {
        this.pf_close_tm = pf_close_tm;
    }

    public String getStoreBrand() {
        return storeBrand;
    }

    public void setStoreBrand(String storeBrand) {
        this.storeBrand = storeBrand;
    }

    public String getUse_ai_price() {
        return use_ai_price;
    }

    public void setUse_ai_price(String use_ai_price) {
        this.use_ai_price = use_ai_price;
    }

    public String getRCP_ORGID() {
        return RCP_ORGID;
    }

    public void setRCP_ORGID(String RCP_ORGID) {
        this.RCP_ORGID = RCP_ORGID;
    }

    public String getPpe_recycle_type() {
        return ppe_recycle_type;
    }

    public void setPpe_recycle_type(String ppe_recycle_type) {
        this.ppe_recycle_type = ppe_recycle_type;
    }

    public String getPRDPROPERTY() {
        return PRDPROPERTY;
    }

    public void setPRDPROPERTY(String PRDPROPERTY) {
        this.PRDPROPERTY = PRDPROPERTY;
    }

    public String getSD_LEVEL() {
        return SD_LEVEL;
    }

    public void setSD_LEVEL(String SD_LEVEL) {
        this.SD_LEVEL = SD_LEVEL;
    }

    public String getPRICE_PROMOTION_B2C() {
        return PRICE_PROMOTION_B2C;
    }

    public void setPRICE_PROMOTION_B2C(String PRICE_PROMOTION_B2C) {
        this.PRICE_PROMOTION_B2C = PRICE_PROMOTION_B2C;
    }

    public String getPRICE_PROMOTION_SH() {
        return PRICE_PROMOTION_SH;
    }

    public void setPRICE_PROMOTION_SH(String PRICE_PROMOTION_SH) {
        this.PRICE_PROMOTION_SH = PRICE_PROMOTION_SH;
    }

    public String getPRICE_PROMOTION_C1() {
        return PRICE_PROMOTION_C1;
    }

    public void setPRICE_PROMOTION_C1(String PRICE_PROMOTION_C1) {
        this.PRICE_PROMOTION_C1 = PRICE_PROMOTION_C1;
    }

    public String getDEF_SALES_ADD_PRICE() {
        return DEF_SALES_ADD_PRICE;
    }

    public void setDEF_SALES_ADD_PRICE(String DEF_SALES_ADD_PRICE) {
        this.DEF_SALES_ADD_PRICE = DEF_SALES_ADD_PRICE;
    }

    public String getBa_create_username() {
        return ba_create_username;
    }

    public void setBa_create_username(String ba_create_username) {
        this.ba_create_username = ba_create_username;
    }

    public String getBa_mobile() {
        return ba_mobile;
    }

    public void setBa_mobile(String ba_mobile) {
        this.ba_mobile = ba_mobile;
    }

    public String getSYS_ORDERTYPE_VALUE() {
        return SYS_ORDERTYPE_VALUE;
    }

    public void setSYS_ORDERTYPE_VALUE(String SYS_ORDERTYPE_VALUE) {
        this.SYS_ORDERTYPE_VALUE = SYS_ORDERTYPE_VALUE;
    }


}
