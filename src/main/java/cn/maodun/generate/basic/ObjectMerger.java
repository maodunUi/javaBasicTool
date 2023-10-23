package cn.maodun.generate.basic;

import java.lang.reflect.Field;

public class ObjectMerger {

    public static <T> T merge(T target, T source) {
        if (target == null || source == null) {
            throw new IllegalArgumentException("Both target and source objects must be non-null");
        }

        // 获取目标对象的类
        Class<?> targetClass = target.getClass();

        try {
            // 遍历目标对象的所有字段
            for (Field field : targetClass.getDeclaredFields()) {
                // 设置字段可访问
                field.setAccessible(true);

                // 获取字段的值
                Object sourceValue = field.get(source);

                // 如果源对象的字段值不为空，则将其赋给目标对象
                if (sourceValue != null) {
                    field.set(target, sourceValue);
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Error merging objects", e);
        }

        return target;
    }
}
