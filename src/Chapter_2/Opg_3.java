package Chapter_2;

import java.util.Scanner;

public class Opg_3 {

    public static void main(String[] args) {

        Scanner meterInput = new Scanner(System.in);
        System.out.print("Meter: ");
        double meter = meterInput.nextDouble();
        double feet = meter * 3.2786;
        System.out.println("Feet: " + feet);

    }

}
