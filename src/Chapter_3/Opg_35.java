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

public class Opg_35 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Write a number: ");
        int number = input.nextInt();
        if ((number % 2) == 0) {System.out.println(number + " is an even number");}
        else {System.out.println(number + " is an odd number");}

    }

}
