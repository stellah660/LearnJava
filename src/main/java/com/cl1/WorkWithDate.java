package com.cl1;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class WorkWithDate {
    //get the current time and date
    @Getter
    @Setter
    LocalDateTime timeNow = LocalDateTime.now();

}
