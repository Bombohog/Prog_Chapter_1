package Chapter_2;

import java.util.Scanner;

public class Opg_8 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int gmt = input.nextInt();
        long totalseconds = (System.currentTimeMillis()) / 1000;
        long currentsecond = totalseconds % 60;
        long currentminute = totalseconds / 60 % 60;
        long currenthour = totalseconds / 3600 % 24;
        System.out.println("The current time is " + (currenthour+gmt) + ":" + currentminute + ":" + currentsecond);

    }

}
