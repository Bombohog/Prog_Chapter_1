package Chapter_2;

import java.util.Scanner;

public class Opg_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of a side of the hexagon: ");
        double side = input.nextDouble();
        double area = ((3 * Math.sqrt(3))/ 2) * (side * side);
        System.out.println("Hexagon area: " + area);

    }

}
