package com.judith;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double n1,double n2){
        int newn1= (int) (n1*1000);
        int newn2= (int) (n2*1000);
        return newn1 == newn2;
    }
}
