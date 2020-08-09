package com.judith;

public class HighScorePosition {
    public static void displyHighScorePosition(String name, int position){
        System.out.println(" The player name "+ name + " maneged to get into position "+ position+
                " on the high score table");

    }
    public static int calculateHighScorePosition(int playerScore){
        //be aware of the edge point- the range-
        // to see if ther is no bug!!!
    /* if(playerScore >= 10000)
         return 1;
     else if (playerScore>=500 *//*&& playerScore < 10000*//**//*this expression always will be true -redundant code*//*)
         return 2 ;
     else if (playerScore>=100 *//*&& playerScore < 500*//*)
         return 3;
     return 4;*/
        int position = 4;//assuming position 4 will be return ---> more readable code
        if(playerScore >= 10000)
            position = 1;
        else if (playerScore>=500)
            position =2;
        else if (playerScore>=100 )
            position= 3;
        return position;

    }
}
