package Chapter_2;

import java.util.Scanner;

public class Opg_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter: Airplanes acceleration and take-off speed: ");
        double v = input.nextDouble();
        double a = input.nextDouble();
        double length = (v * v) / (2 * a);
        System.out.println("The minimum runway length: " + length);

    }

}
