/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 06-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_4;

import java.util.Scanner;

public class Opg_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String ISBN_Input = input.next();
        ISBN_Number(Integer.parseInt(ISBN_Input));

    }

    public static void ISBN_Number(int ISBN) {

        int d1 = (ISBN / 100000000) % 10;
        int d2 = (ISBN / 10000000) % 10;
        int d3 = (ISBN / 1000000) % 10;
        int d4 = (ISBN / 100000) % 10;
        int d5 = (ISBN / 10000) % 10;
        int d6 = (ISBN / 1000) % 10;
        int d7 = (ISBN / 100) % 10;
        int d8 = (ISBN / 10) % 10;
        int d9 = ISBN % 10;
        int d10 = (d1 * 1 + d2 * 2 +  d3 * 3 +  d4 * 4 +  d5 * 5 +  d6 * 6 +  d7 * 7 +  d8 * 8 +  d9 * 9) % 11;

        if (d10 != 10) {System.out.println("The ISBN-10 number is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);}
        else {System.out.println("The ISBN-10 number is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");}

    }

}
