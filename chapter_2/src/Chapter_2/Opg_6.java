package Chapter_2;

import java.util.Scanner;

public class Opg_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Integer (0 - 1000): ");
        int integer = input.nextInt();
        int result = 0;

        if (!(integer >= 1000 || integer <= 0)) {

            if (integer >= 100) {

                result = integer % 10 * ((integer / 10) % 10) * (((integer / 10) / 10) % 10);

            } else if (integer >= 10 && integer < 100) {

                result = integer % 10 * ((integer / 10) % 10);

            } else if (integer > 0 && integer < 10) {

                result = integer;

            }

            System.out.println("Result: " + result);

        } else {

            System.out.println("ERROR!!! check the input!");

        }

    }

}
