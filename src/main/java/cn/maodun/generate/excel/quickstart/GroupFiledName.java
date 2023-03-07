package cn.maodun.generate.excel.quickstart;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * @author DELL
 * @date 2022/11/17
 */
public class GroupFiledName {
    @ExcelProperty("字段名称")
    private String fieldName;
    @ExcelProperty("字段分组")
    private String groupName;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "GroupFiledName{" +
                "fieldName='" + fieldName + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }



}
