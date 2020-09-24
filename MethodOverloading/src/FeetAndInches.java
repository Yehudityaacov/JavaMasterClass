public class FeetAndInches {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet<0)||(inches<0||inches>12)){
            System.out.println("invalid");
            return -1;
        }
        double centimeters=(feet*30.48)+(inches*2.54);// or ((feet*12)*2.54)+(inches*2.54)
        System.out.println("calculate Centimeter Result =  "+centimeters);
        return centimeters;

    }
    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            System.out.println("invalid");
            return -1;
        }
        double feet = (int) inches / 12;
        double remainderInches = inches % 12;

        double centimeters = calcFeetAndInchesToCentimeters(feet, remainderInches);

        System.out.println("calculate Centimeter Result =  " + centimeters+"= "+feet +"+"+remainderInches);
        return centimeters;
    }

}
