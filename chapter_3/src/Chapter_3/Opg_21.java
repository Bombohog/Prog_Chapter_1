/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 23-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_3;

import java.util.Scanner;

public class Opg_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter day of the month: 1-31: ");
        int dayOfTheMonth = input.nextInt();
        
        if (month == 1) {month = 13;}
        else if (month == 2) {month = 14;}
        int yearOfTheCentury = year % 100;
        int intDayOfTheWeek = (dayOfTheMonth +
                ((26 * (month + 1)) / 10) +
                yearOfTheCentury +
                (yearOfTheCentury / 4) +
                ((year / 100) / 4) +
                (5 * (year / 100))) % 7;

        String stringDayOfTheWeek = null;
        
        switch (intDayOfTheWeek) {
            case 0 -> stringDayOfTheWeek = "Saturday";
            case 1 -> stringDayOfTheWeek = "Sunday";
            case 2 -> stringDayOfTheWeek = "Monday";
            case 3 -> stringDayOfTheWeek = "Tuesday";
            case 4 -> stringDayOfTheWeek = "Wednesday";
            case 5 -> stringDayOfTheWeek = "Thursday";
            case 6 -> stringDayOfTheWeek = "Friday";
        }
        
        System.out.println("Day of the week is " + stringDayOfTheWeek);

    }

}
