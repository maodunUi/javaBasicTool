package cn.maodun.generate.date;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * @author DELL
 * @date 2022/6/22
 */
public class TestCalendar {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // get the current date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date.format(formatter));
    }
}
