/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 21-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_3;

import java.util.*;

public class Opg_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("write a number for today(sunday = '0', monday = '1' and saturday = '6'): ");
        int dayIndex = input.nextInt();

        System.out.print("Enter how many days elapsed since today: ");
        int futureDayIndex = input.nextInt();

        if ((dayIndex + futureDayIndex) > 6) {futureDayIndex = (dayIndex + futureDayIndex) - 6;}
        else {futureDayIndex += dayIndex;}

        String today = day(dayIndex);
        String futureDay = day(futureDayIndex);

        System.out.println("Today is " + today + " and the future day is " + futureDay);

    }

    public static String day(int input) {

        switch (input) {
            case 0 -> {return "sunday";}
            case 1 -> {return "monday";}
            case 2 -> {return "tuesday";}
            case 3 -> {return "wednesday";}
            case 4 -> {return "thursday";}
            case 5 -> {return "friday";}
            case 6 -> {return "saturday";}
        }

        return null;
    }

}
