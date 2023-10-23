package cn.maodun.generate.excel.test;

import cn.maodun.generate.excel.pojo.DemoData;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.util.ListUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author DELL
 * @date 2023/9/15
 */
public class Test01 {
    /**
     * 动态头，实时生成头写入
     * <p>
     * 思路是这样子的，先创建List<String>头格式的sheet仅仅写入头,然后通过table 不写入头的方式 去写入数据
     *
     * <p>
     * 1. 创建excel对应的实体对象 参照{@link DemoData}
     * <p>
     * 2. 然后写入table即可
     */

    public static void main(String[] args) {
        Test01 test01 = new Test01();
        String fileName = "C:\\shanhs\\practiceCode\\javaBasic\\src\\main\\java\\cn\\maodun\\generate\\excel\\excelFile\\战略发展部日数据同步报表.xlsx";
        EasyExcel.write(fileName)
                // 这里放入动态头
                .head(test01.head()).sheet("模板")
                // 当然这里数据也可以用 List<List<String>> 去传入
                .doWrite(test01.data());
    }

    private List<DemoData> data() {
        List<DemoData> list = ListUtils.newArrayList();
        for (int i = 0; i < 10; i++) {
            DemoData data = new DemoData();
            data.setName("字符串" + i);
            data.setDate(new Date());
            data.setDoubleData(0.56);
            list.add(data);
        }
        return list;
    }
    private List<List<String>> head() {
        List<List<String>> list = new ArrayList<List<String>>();
        List<String> head0 = new ArrayList<String>();
        head0.add("字符串" + System.currentTimeMillis());
        List<String> head1 = new ArrayList<String>();
        head1.add("数字" + System.currentTimeMillis());
        List<String> head2 = new ArrayList<String>();
        head2.add("日期" + System.currentTimeMillis());
        list.add(head0);
        list.add(head1);
        list.add(head2);
        return list;
    }
}
