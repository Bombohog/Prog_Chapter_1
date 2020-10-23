package Chapter_2;

import java.util.Scanner;

public class Opg_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter: start velocity[v0], ending velocity[v1] and time span[t]: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        double a = (v1 - v0) / t;
        System.out.println("The average acceleration " + a);

    }

}
