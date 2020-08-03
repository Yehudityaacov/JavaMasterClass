package com.judith;

public class Main {

    public static void main(String[] args) {
	/*char nyChar = 'D';
	char myCharUnicode='\u0044';
        System.out.println(myCharUnicode);
        char UnicodeCopyWrite='\u00A9';
        System.out.println(UnicodeCopyWrite);
        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is an correct");
        }
        *//*boolean isCar= true;
        if(isCar = true){
            System.out.println("This is not supposed to happen");
        }
        if(isCar == true){
            System.out.println("This is not supposed to happen");
        }
        if(isCar ){
            System.out.println("This is not supposed to happen");
        }
        if(!isCar){
            System.out.println("This is not supposed to happen");
        }*//*
        double oneValue=20.00d;
        double scoundValue=80.00d;
        double totalSum =(oneValue+scoundValue)*100.00d;
        System.out.println("total Sum= "+ totalSum);
        double remainder =(totalSum % 40.00d);
        boolean isNotRemainder= (remainder==0) ? true:false;
        System.out.println("Is there a remainder " + isNotRemainder);
        if(!isNotRemainder){
            System.out.println("Got some remainder");
        }*/

        calaulatScore(true,50000,5,100);

       /* if(gameOver==true){
            int finalScore = score+(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("Your Score is = "+ finalScore);
        }*/
        /*
        invalid expression finalScore below it created in scoop above and you can'nt cell it outside the code block
       can'nt access the variable that created in another scoop
        int savedFinalScore = finalScore;
        sone the code block is finished
        java will delete that
        */

       ;
        calaulatScore(true,10000,8,200);


    }
    public static void calaulatScore(boolean gameOver, int score,int levelComplet, int bonus)
    {
        if(gameOver){
            int finalScore=score+(levelComplet*bonus);
            System.out.println("Your Score is = "+ finalScore);
        }

    }
}
