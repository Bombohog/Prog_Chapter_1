package Chapter_2;

import java.util.Scanner;

public class Opg_4 {

    public static void main(String[] args) {

        Scanner meterSQRTInput = new Scanner(System.in);
        System.out.print("Square meters: ");
        double meterSQRT = meterSQRTInput.nextDouble();
        double ping = meterSQRT * 0.3025;
        System.out.println("Ping: " + ping);

    }

}
