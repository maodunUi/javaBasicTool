package cn.maodun.generate.excel.quickstart;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import java.util.Objects;

/**
 * @author DELL
 * @date 2022/11/17
 */
public class DemoDataListener3 implements ReadListener<GroupFiledName> {

    @Override
    public void invoke(GroupFiledName groupFiledName, AnalysisContext analysisContext) {
        if (Objects.nonNull(groupFiledName.getFieldName()) && Objects.nonNull(groupFiledName.getGroupName())){
            QuickStart.groupMap.put(groupFiledName.getFieldName(), groupFiledName.getGroupName());
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
