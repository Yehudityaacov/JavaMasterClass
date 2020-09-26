import java.util.Scanner;

public class Main {
   public static void main (String[] args){
      // DayOfTheWeekChall.printDayOfTheWeek(5);
//       System.out.println(DigitSumChallenge.sumDigit(1));
//       System.out.println(DigitSumChallenge.sumDigit(125));
//       System.out.println(DigitSumChallenge.sumDigit(-125));
//       System.out.println(DigitSumChallenge.sumDigit(32123));
       //DiagonalStar.printSquareStar(5);
       Scanner in = new Scanner(System.in);
       System.out.println(" Enter your year of birth:");
       boolean hasNextInt= in.hasNextInt();
       if(hasNextInt){

           int yearOfBirth=in.nextInt();// if we read a number and press enter the scanner read it as a value - issue
           in.nextLine();// handle next line character (enter key).1
           System.out.println("Please Enter your name");
           String name = in.nextLine();
           int age = 2020-yearOfBirth;
           if(age<=0 && age >=98){
               System.out.println(" Your name is: "+ name+", and you are "+age+" years old. ");
           }else{
               System.out.println("Invalid year of birth ");
           }

       }else{
           System.out.println("enable to parse year of birth");
       }



       in.close();/// if we don't need the scanner anymore
   }
}

