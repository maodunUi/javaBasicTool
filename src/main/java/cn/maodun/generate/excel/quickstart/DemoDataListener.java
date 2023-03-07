package cn.maodun.generate.excel.quickstart;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import java.util.Objects;

/**
 * @author DELL
 * @date 2022/11/17
 */
public class DemoDataListener implements ReadListener<Report210> {

    @Override
    public void invoke(Report210 report210, AnalysisContext analysisContext) {
        if (Objects.nonNull(report210.getOrderCode()) && report210.getOrderCode().contains("20221103")){
            QuickStart.sourceList.add(report210);
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
