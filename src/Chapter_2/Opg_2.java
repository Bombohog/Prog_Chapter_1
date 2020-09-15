package Chapter_2;

import java.util.Scanner;

public class Opg_2 {

    public static void main(String[] args) {

        Scanner lengthInput = new Scanner(System.in);
        System.out.print("Length of triangle sides: ");
        double length = lengthInput.nextDouble();
        double area = ((Math.sqrt(3))/4) * (length * length);
        System.out.println("Area: " + area);
        double volume = area * length;
        System.out.println("The volume of the triangular prism is: " + volume);

    }

}
