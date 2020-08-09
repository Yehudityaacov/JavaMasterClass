package com.judith;

public class SpeedConversion {
    public static long toMillesPerHour(double kilometerPerHour){
        if(kilometerPerHour<0)
            return -1;
        return Math.round(kilometerPerHour/1.609);
    }

    public static void printConversion(double kilometerPerHour){
        long millConvert=toMillesPerHour( kilometerPerHour);
        if (millConvert== -1)
        {
            System.out.println("invalid value");
        }
        else
            System.out.println(kilometerPerHour + " Km/h"+"="+millConvert+ " mi/h");
    }
}
