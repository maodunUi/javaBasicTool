package cn.maodun.generate.excel.quickstart;

import com.alibaba.excel.EasyExcel;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author DELL
 * @date 2022/11/17
 */
public class QuickStart {

    public static List<Report210> sourceList = new ArrayList<>();
    public static List<Report210> descList = new ArrayList<>();

    /**
     * 字段名称：组名
     */
    public static  Map<String,String> groupMap = new HashMap<>() ;

    public static  Map<String,String> outputStrMap = new HashMap<>() ;

    public static void main(String[] args) {
        // 有个很重要的点 DemoDataListener 不能被spring管理，要每次读取excel都要new,然后里面用到spring可以构造方法传进去
        // 写法3：
       String fileName = "source.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, Report210.class, new DemoDataListener()).sheet().doRead();

        // 有个很重要的点 DemoDataListener 不能被spring管理，要每次读取excel都要new,然后里面用到spring可以构造方法传进去
        // 写法3：
        String fileName2 = "desc.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName2, Report210.class, new DemoDataListener2()).sheet().doRead();

        String fileName3 = "分组字段.xls";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName3, GroupFiledName.class, new DemoDataListener3()).sheet().doRead();

        Map<String, Report210> sourceMap = sourceList.stream().filter(o -> Objects.nonNull(o.getPRDDETAILCODE())).collect(Collectors.toMap(Report210::getPRDDETAILCODE, o -> o ));
        Map<String, Report210> descMap = descList.stream().filter(o -> Objects.nonNull(o.getPRDDETAILCODE())).collect(Collectors.toMap(Report210::getPRDDETAILCODE, o -> o));

        List<Report210> noPick = new ArrayList<>() ;
        List<Report210> notPick = new ArrayList<>() ;
        descMap.forEach((k,v) -> {
            Report210 report210 = sourceMap.get(k);
            if (Objects.isNull(report210)){
                noPick.add(v);
            }else {
                if (!report210.equals(v)){
                    notPick.add(v);
                }
            }
        });

        outputStrMap.forEach((k,v) ->{
            String groupName = groupMap.get(k);
            if (Objects.nonNull(groupName)){
                System.out.println(groupName+ "          " +k + ":     " + v);
            }
        });

//        System.out.println("-----------不存在的数据--------------");
//        noPick.stream().forEach(o -> {
//            System.out.println(o);
//        });
//
//        System.out.println("-----------匹配错误数据--------------");
//        notPick.stream().forEach(o -> {
//            System.out.println(o);
//        });


    }
}
