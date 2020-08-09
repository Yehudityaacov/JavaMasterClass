package com.judith;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        int megaBytes =kiloBytes/1024;
        int theRemaining = kiloBytes%1024;
        System.out.println("kiloBytes "+kiloBytes+"= megabytes "+megaBytes+" remaining kilobytes "+theRemaining);
    }
}
