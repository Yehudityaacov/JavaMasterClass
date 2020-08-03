package com.judith;//in the website  or an app it will tern to judith.com

public class Main {

    public static void main(String[] args) {

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minmum value of int = "+ minIntValue);
        System.out.println("Integer maximum value of int = " + maxIntValue);
        //**important concept  to be aware of
        //Overflow- a number larger then the maximum
        System.out.println("busted minmum value of int = "+ (minIntValue - 1));
        //Underflow - a number smaller then the minimum
        System.out.println("busted maximum  value of int = " + (maxIntValue + 1));
        //also work under scoop on nuber in java 7+
        int myNumber=2_147_483_647;

        byte byteMinValue= Byte.MIN_VALUE;
        byte byteMaxValue= Byte.MAX_VALUE;
        System.out.println("Byte minmum value  = "+ byteMinValue);
        System.out.println("Byte maximum value  = " + byteMaxValue);

        short shortMinValue= Short.MIN_VALUE;
        short shortMaxValue= Short.MAX_VALUE;
        System.out.println("Short minmum value  = "+ shortMinValue);
        System.out.println("Short maximum value  = " + shortMaxValue);

        long myLong = 100L;
        long longMinValue= Long.MIN_VALUE;
        long longMaxValue= Long.MAX_VALUE;
        System.out.println("Long minmum value  = "+ longMinValue);
        System.out.println("Long maximum value  = " + longMaxValue);
        short bigShortLiteralValue = 32767;
        int myTotal = (minIntValue /2);
        // the output of byteMinValue/2) by defulte is an  int --we got an error spo we need to preform casting to byte
        byte myNewByteValue = (byte) (byteMinValue/2);
        // the output of byteMinValue/2) by defulte is an  int --we got an error spo we need to preform casting to short
        short myNewSortValue = (short) (shortMinValue/2);
        byte myByte = 123;
        short myShort= 324;
        int myInt = 1234;
        PrimitiveTypesChallenge ng = new PrimitiveTypesChallenge();
        long myLongTotal=ng.PrimitiveTypes(myInt,myByte,myShort);
        System.out.println(myLongTotal);


        //Single and Double Precision-- floating point number to more precise calculation
        float floatMinValue= Float.MIN_VALUE;
        float floatMaxValue= Float.MAX_VALUE;
        System.out.println("Float minmum value  = "+ floatMinValue);
        System.out.println("Float maximum value  = " + floatMaxValue);

        double doubleMinValue= Double.MIN_VALUE;
        double doubleMaxValue= Double.MAX_VALUE;
        System.out.println("Double minmum value  = "+ doubleMinValue);
        System.out.println("Double maximum value  = " + doubleMaxValue);

        int myIntVal =5;
        float myFloat= 5f/2;
        //recommended to use double is the default floating pint in java
        double myDouble =5d/2;
        System.out.println("myIntVal "+myIntVal);
        System.out.println("myFloat "+myFloat);
        System.out.println("myDouble "+myDouble);





    }
}
