public class DigitSumChallenge {
    public static int sumDigit(int num){
        int sum=0;
        if(num<10){
            return -1;
        }
        do{
            sum= sum+ num % 10;
            num/=10;
        }while(num != 0);
        return sum;
    }

}
