package com.judith;

public class Main {

    public static void main(String[] args) {
       // HighScorePosition.displyHighScorePosition("Moshe",HighScorePosition.calculateHighScorePosition(15000));
       // HighScorePosition.displyHighScorePosition("Avi",HighScorePosition.calculateHighScorePosition(900));
       // HighScorePosition.displyHighScorePosition("David",HighScorePosition.calculateHighScorePosition(400));
       // HighScorePosition.displyHighScorePosition("Tal",HighScorePosition.calculateHighScorePosition(50));
        //checkNumber(0);
       // SpeedConversion.printConversion( 10.5);
        //MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
      // boolean isLeap= LeapYearCalculator.isLeapYear(2000);
     //   System.out.println("is the year is a leap year? " +isLeap);
        boolean b = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    }


   public static void checkNumber(int number){
        if(number>0)
            System.out.println("positive");
        else if(number<0)
           System.out.println("negative");
        else
           System.out.println("zero");
   }

}
