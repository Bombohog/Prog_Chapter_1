package Chapter_2;

import java.util.Scanner;

public class Opg_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Minutes: ");
        int minutes = input.nextInt();
        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;
        System.out.println("years: " + years + " and days: " + days);

    }

}
