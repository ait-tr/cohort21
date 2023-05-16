package com.ait.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Reminder {
    private String title;
    private String period;
    private String month;
    private int number;
    private int index;
    private String period2;
    private String year;
    private String timeOfDay;
    private int xHour;
    private int yHour;
    private int xMin;
    private int yMin;
    private String repeat;
    private double start;
    private double stop;
    private String typeRep;
}