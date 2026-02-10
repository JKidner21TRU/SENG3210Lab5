package com.example.lab5;

public class MathUtil {

    public static double abs(double value){
        if(value>0) {
        return value;
        }
        else if(value<0) {
            return value*-1;
        }
        else {
            return value;
        }
    }
}
