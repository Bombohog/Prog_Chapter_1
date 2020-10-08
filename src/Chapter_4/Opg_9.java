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

public class Opg_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = input.next().charAt(0);
        System.out.println("The Unicode value of " + ch + " is: " + (int) ch);

    }

}
