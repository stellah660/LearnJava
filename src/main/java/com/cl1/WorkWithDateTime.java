package com.cl1;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class WorkWithDateTime {
    //get the current time and date
    @Getter
    @Setter
    LocalDateTime timeNow = LocalDateTime.now();
    @Setter
    @Getter
    LocalDate dateToday = LocalDate.now();
    @Setter
    @Getter
    LocalTime localTime = LocalTime.now();
    @Setter
    @Getter
    LocalDate someDate = LocalDate.of(
            2003,
            Month.NOVEMBER,
            13
    );

}
