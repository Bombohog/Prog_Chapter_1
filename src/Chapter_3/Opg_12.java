/********************************************
* Project description
* 
* Created by: Lasse J. Kongsdal
* Date: 22-09-2020
* 
* Description of program
********************************************/

package Chapter_3;

import java.util.Scanner;

public class Opg_12 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        if (number >= 100 && number < 1000) {

            if ((number % 10) == (number / 100)) {System.out.println(number + " is a palindrome");}
            else {System.out.println(number + " is not a palindrome");}

        }

    }
    
}
