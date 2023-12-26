package com.cl1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

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
        WorkWithDate time = new WorkWithDate();//instantiating the WorkWithDate class
        LocalDateTime timeNow = time.getTimeNow();//calling the getter method
        System.out.println(timeNow);
        System.out.println(timeNow.getDayOfMonth());
        System.out.println(timeNow.getDayOfWeek());
        System.out.println(timeNow.getDayOfYear());
        System.out.println(timeNow.getHour());
    }

}
