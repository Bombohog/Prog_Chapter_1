/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 13-11-2020
 *
 * Description of program
 ********************************************/

package Chapter_11.Opg_11_10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MyStack myStack = new MyStack();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter String: ");
            myStack.push(input.nextLine());
        }

        System.out.println();
        final int stackSize = myStack.getSize();
        for (int i = 0; i < stackSize; i++) {
            System.out.println(myStack.pop().toString());
        }

    }

}
