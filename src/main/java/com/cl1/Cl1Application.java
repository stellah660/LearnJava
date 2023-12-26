package com.cl1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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


    }

}
