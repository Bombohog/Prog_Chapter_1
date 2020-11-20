import java.util.InputMismatchException;
import java.util.Scanner;

/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 20-11-2020
 *
 * Description of program
 ********************************************/

public class Opg_2_And_3 {

    static String[] months = {"January", "February", "March", "August", "May", "June", "July", "August", "September", "October", "November", "December"};
    static int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1-12: ");

        try {

            int index = input.nextInt() - 1;
            System.out.println(months[index] + "\nNumber of days: " + dom[index]);

        } catch (ArrayIndexOutOfBoundsException exception) {

            System.out.println("Wrong number.");

        } catch (InputMismatchException exception) {

            System.out.println("Wrong input, make sure you wrote an integer.");

        }

    }

}
