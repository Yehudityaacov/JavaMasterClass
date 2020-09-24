public class SecondsAndMinutChallenge {
    private static final String INVALED_VALUE_MASSAGE = "Invalid Value";
    //final String INVALED_VALUE = "Invalid Value";
    public static String getDurationString(int minutes, int seconds){
        if((minutes<0)||(seconds<0||seconds>59)){
            //.out.println("Invalid Value");
           // INVALED_VALUE="66"; error !! because it is final can'nt be change once it diffed
            return INVALED_VALUE_MASSAGE;

        }

        int hours =( minutes/60);
        int remainMinute= minutes%60;
        String hoursString=hours+"h ";
        String remainMinuteString= remainMinute+"m ";
        String secondString=seconds+"s ";
        if(hours<10)
            hoursString="0"+hoursString;

        if (remainMinute<10)
           remainMinuteString="0"+remainMinuteString;
        if(seconds<10)
            secondString="0"+secondString;
        return hoursString+" "+remainMinuteString+" "+secondString;
        


     /*   if((hours<10)&&remainMinute>10 && seconds>10)
            return  "0"+hours+"H "+remainMinute +"M "+seconds +" S";
        else if((hours>10)&&remainMinute<10 && seconds>10)
            return  +hours+"H "+"0"+remainMinute +"M "+seconds +" S";
        else if((hours>10)&&remainMinute>10 && seconds<10)
            return  hours+"H "+remainMinute +"M "+"0"+seconds +" S";
        else if((seconds<10)&&( hours<10)&&remainMinute>10)
            return  "0"+hours+"H "+remainMinute +"M "+"0"+seconds +" S";
        else if((remainMinute<10)&&( hours<10)&&seconds>10)
            return  "0"+hours+"H "+"0"+remainMinute +"M "+seconds +" S";
        else if((hours>10)&&( remainMinute<10)&& seconds<10)
            return  hours+"H "+"0"+remainMinute +"M "+"0"+seconds +" S";
        else if ((remainMinute<10)&&( hours<10)&&(seconds<10))
            return  "0"+hours+"H "+"0"+remainMinute +"M "+"0"+seconds +" S";
        else return  hours+"H "+remainMinute +"M "+seconds +" S";*/


    }
    public static String getDurationString(int seconds) {
        if (seconds < 0){
            return INVALED_VALUE_MASSAGE;
        }
        int minutes= (seconds/60);
        int remainSecond=seconds%60;
        return getDurationString(minutes,remainSecond);

    }
}
