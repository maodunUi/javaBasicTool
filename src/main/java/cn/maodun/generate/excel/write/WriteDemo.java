package cn.maodun.generate.excel.write;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.util.ListUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author DELL
 * @date 2022/11/21
 */
public class WriteDemo {
    public static void main(String[] args) {
        String fileName =  "a.xlsx";
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        EasyExcel.write(fileName, ComplexHeadData.class).sheet("模板").doWrite(data());
    }

//    private static List<ComplexHeadData> data() {
//        List<ComplexHeadData> list = ListUtils.newArrayList();
//        for (int i = 0; i < 10; i++) {
//            ComplexHeadData data = new ComplexHeadData();
//            data.setString("字符串" + i);
//            data.setDate(new Date());
//            data.setDoubleData(0.56);
//            list.add(data);
//        }
//        return list;
//    }


    private static List<List<String>> data() {
        List<List<String>> allList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            List<String> list = ListUtils.newArrayList();
            list.add(i+"");
            list.add(i+"第二个");
            list.add(i+"第三个");
            list.add(i+"第四个");
            list.add(i+"第五个");
            allList.add(list);
        }
        return allList;
    }

    /**
     * 动态头，实时生成头写入
     * <p>
     * 思路是这样子的，先创建List<String>头格式的sheet仅仅写入头,然后通过table 不写入头的方式 去写入数据
     *
     * <p>
     * 1. 创建excel对应的实体对象 参照{@link }
     * <p>
     * 2. 然后写入table即可
     */
    @Test
    public void dynamicHeadWrite() {
        String fileName =  "a.xlsx";
        EasyExcel.write(fileName)
                // 这里放入动态头
                .head(head(Arrays.asList("划痕","磕碰"))).sheet("模板")
                // 当然这里数据也可以用 List<List<String>> 去传入
                .doWrite(data());
    }

    private List<List<String>> head(List<String> huaWeiGroupDetailNames) {
        List<List<String>> allHead = new ArrayList<>();
        List<String> groups = Arrays.asList("比价渠道", "引用价格", "日期", "品牌", "机型", "内存");
//        groups.stream().forEach(g -> {
//            List<String> noSplitHead0 = new ArrayList<String>();
//            noSplitHead0.add(g);
//            allHead.add(noSplitHead0);
//        });
        List<String> companys = Arrays.asList("深圳华为", "深圳华为（含补贴）", "爱回收", "爱回收（含补贴）", "深圳华为&爱回收", "深圳华为&爱回收（含补贴）");
        for (String company : companys) {
            huaWeiGroupDetailNames.stream().forEach(o -> {
                List<String> head0 = new ArrayList<String>();
                head0.add(company);
                head0.add(o);
                allHead.add(head0);
            });
        }
        return allHead;
    }
}
