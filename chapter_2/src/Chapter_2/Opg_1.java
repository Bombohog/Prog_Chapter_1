package Chapter_2;

import java.util.Scanner;

public class Opg_1 {

    public static void main(String[] args) {

        Scanner mileInput = new Scanner(System.in);
        System.out.print("Miles: ");
        double miles = mileInput.nextDouble();
        double km = miles * 1.6;
        System.out.println("Kilometers: " + km);

    }

}
