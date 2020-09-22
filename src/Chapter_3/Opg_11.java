/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 22-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_3;

import java.util.*;
import java.time.YearMonth;

public class Opg_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter month('1', '2'...'12') and year: ");
        int monthIndex = input.nextInt();
        int year = input.nextInt();
        String month = null;
        
        switch (monthIndex) {
            case 1 -> month = "January";
            case 2 -> month = "February";
            case 3 -> month = "March";
            case 4 -> month = "April";
            case 5 -> month = "May";
            case 6 -> month = "June";
            case 7 -> month = "July";
            case 8 -> month = "August";
            case 9 -> month = "September";
            case 10 -> month = "October";
            case 11 -> month = "November";
            case 12 -> month = "December";
        }

        // Get the number of days in that month
        YearMonth yearMonthObject = YearMonth.of(year, monthIndex);
        int daysInMonth = yearMonthObject.lengthOfMonth();

        System.out.println(month + " " + year + " has " + daysInMonth + " days.");

    }

}
