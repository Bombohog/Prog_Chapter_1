import java.util.ArrayList;
import java.util.Scanner;

/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 10-11-2020
 *
 * Description of program
 ********************************************/

public class Opg_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter sequence of numbers: ");

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (input.nextInt() > -1) {
            list.add(input.nextInt());
        }

        System.out.println(max(list));

    }

    public static Integer max(ArrayList<Integer> list) {

        Integer currentMax = 0;
        for (Integer currentInt : list) {
            if (currentInt > currentMax) {
                currentMax = currentInt;
            }
        }

        if (!(currentMax <= 0)) {
            return currentMax;
        } else {
            return null;
        }

    }

}

