package com.company.codingTest;

import javax.swing.text.DateFormatter;
import java.time.*;

public class Date {
    public String solution(int a, int b) {
        String[] fullName = {"FRIDAY", "SATURDAY", "SUNDAY", "MONDAY","TUESDAY", "WEDNESDAY","THURSDAY"};
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        LocalDate localDate = LocalDate.of(2016, a, b);
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime );
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Seoul"));

        for(int i = 0 ; i < fullName.length ;i++){
            if (zonedDateTime.getDayOfWeek().toString().equals(fullName[i])){
                return day[i];
            }
        }

        return  "hi";
    }

    public static void main(String[] args) {
        Date date = new Date();
        String solution = date.solution(5, 24);
        System.out.println(solution);
    }
}
