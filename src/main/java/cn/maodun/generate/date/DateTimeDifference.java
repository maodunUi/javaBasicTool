package cn.maodun.generate.date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDifference {
    public static void main(String[] args) {
        // 创建两个LocalDateTime对象
        LocalDateTime dateTime1 = LocalDateTime.of(2023, 8, 18, 12, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2023, 8, 18, 12, 30, 0);

        // 计算日期和时间差
        Duration duration = Duration.between(dateTime1, dateTime2);

        // 获取天数、小时数、分钟数和秒数
        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        // 打印结果
        System.out.println("时间差：" + days + " 天 " + hours + " 小时 " + minutes + " 分钟 " + seconds + " 秒");
    }
}