/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 23-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Opg_3 {

    public static void main(String[] args) {

        ArrayList<Integer> numbersToCheck = new ArrayList<Integer>(50);
        for (int i = 1; i <= 50; i++) {
            numbersToCheck.add(i);
        }

        ArrayList<Integer> numbersOfOccurences = new ArrayList<Integer>(50);
        for (int i = 1; i <= 50; i++) {
            numbersOfOccurences.add(0);
        }

        // scanner
        Scanner input = new Scanner(System.in);

        // input and numbers:ArrayList<Integer> as placeholder
        System.out.print("Enter the integers between 1 and 50: ");
        int numberToOccurenceCheck = input.nextInt();
        while (numberToOccurenceCheck != 0) {

            // add numbers to list
            if (numbersToCheck.contains(numberToOccurenceCheck)) {

                int index = numbersToCheck.indexOf(numberToOccurenceCheck);
                numbersOfOccurences.set(index, numbersOfOccurences.get(index) + 1);

            }
            numberToOccurenceCheck = input.nextInt();

        }

        // old code: didnt work because .indexOf finds the first and does not skip already checked indexes
        /*
        ArrayList<Integer> indexAlreadyGotten = new ArrayList<Integer>();
        for (int occurence: numbersOfOccurences) {
            if (occurence != 0) {
                String pluralOrNot;
                if (occurence == 1) {pluralOrNot = "time";} else {pluralOrNot = "times";}
                System.out.printf("\n%d occurs %d %s", numbersToCheck.get(numbersOfOccurences.indexOf(occurence)), occurence, pluralOrNot);
            }
        }
        */

        // new code: this gets around the .indexOf by using getters
        for (int i = 0; i < numbersToCheck.size(); i++) {
            if (numbersOfOccurences.get(i) != 0) {

                String pluralOrNot;
                if (numbersOfOccurences.get(i) == 1) {pluralOrNot = "time";} else {pluralOrNot = "times";}
                System.out.printf("\n%d occurs %d %s", numbersToCheck.get(i), numbersOfOccurences.get(i), pluralOrNot);

            }
        }

    }

}
