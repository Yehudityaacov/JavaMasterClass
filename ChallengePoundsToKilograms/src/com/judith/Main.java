package com.judith;


import java.util.Scanner;

public class Main {
// challenge -> convert a given number of pounds to kilograms

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        double nyIntToConvert=in.nextDouble();
        double ConvertToKilog = nyIntToConvert*0.45359237d;
        System.out.println("converted kilogram = "+ ConvertToKilog);

      double pi = 3.14159276;
        // anther way to write a number with underscore
      double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
