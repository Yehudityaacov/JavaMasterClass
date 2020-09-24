public class DiagonalStar {
    public static void printSquareStar(int number){
        int i,j;
        if(number<5){
            System.out.println("Invalid Value");
        }
        else {
            for (i = 1; i <= number; i++) {


                for (j = 1; j <= number; j++)

                    if (j == 1 || i == 1 || j == number || i == number || i == j || (number - i+ 1 == j))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                System.out.println();
            }
        }
    }
}
