package Chapter_2;

import java.util.Scanner;

public class Opg_5 {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Gratuity rate and Subtotal: ");
        double gratuityRate = Input.nextDouble();
        double subTotal = Input.nextDouble();
        double total = subTotal + (subTotal * (gratuityRate / 100));
        System.out.println("Gratuity rate: " + subTotal * (gratuityRate / 100) + "$");
        System.out.println("Total: " + total + "$");

    }

}
