package Chapter_2;

import java.util.Scanner;

public class Opg_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter: Water amount(kg), start temperature and ending temperature: ");
        double amount = input.nextDouble();
        double startTemp = input.nextDouble();
        double endTemp = input.nextDouble();
        double Q = amount * (endTemp - startTemp) * 4184;
        System.out.println("The energy needed is " + Q);

    }

}
