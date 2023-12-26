package com.cl1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@SpringBootApplication
public class Cl1Application {

    public static void main(String[] args) {
        SpringApplication.run(Cl1Application.class, args);
        //working with strings
        String number = String.valueOf(2);
        System.out.println(number);
        //using placeholders
        String number2 = String.format("Number %s",number);
        System.out.println(number2);

        //joining strings
        String[] names = { "Valentine","Stellah", "Maithya"};
        String myName = String.join(" ",names);
        System.out.println(myName);
        //working with dates
        WorkWithDateTime time = new WorkWithDateTime();//instantiating the WorkWithDateTime class
        //calling the getter method
        LocalDateTime timeNow = time.getTimeNow();
        LocalDate localDate = time.getDateToday();
        LocalTime localTime = time.getLocalTime();
        LocalDate someDate = time.getSomeDate();

        //LocalDateTime
        System.out.println(timeNow);
        System.out.println(timeNow.getDayOfMonth());
        System.out.println(timeNow.getDayOfWeek());
        System.out.println(timeNow.getDayOfYear());
        System.out.println(timeNow.getHour());

        //LocalDate
        System.out.println(localDate.atStartOfDay());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getChronology());
        System.out.println(someDate);

        //LocalTime
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());
        System.out.println(localTime.toSecondOfDay());


    }

}
