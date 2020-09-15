package Chapter_2;

import java.util.Scanner;

public class Opg_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter: Weight(pounds) and height(inches): ");
        double weight = input.nextDouble();
        double height = input.nextDouble();
        double BMI = (weight * 0.45359237) / ((height * 0.0254) * (height * 0.0254));
        System.out.println("Your BMI: " + BMI);

    }

}
