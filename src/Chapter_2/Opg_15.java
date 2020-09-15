package Chapter_2;

import java.util.Scanner;

public class Opg_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter: point 1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter: point 2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("Distance: " + distance);

    }

}
