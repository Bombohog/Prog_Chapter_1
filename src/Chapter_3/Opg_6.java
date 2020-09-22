/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 21-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_3;

import java.util.*;

public class Opg_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        double bmi = BMI(weight, feet, inches);
        String bmiStatus = BMIStatus(bmi);

        System.out.println("BMI is: " + bmi + "\n" + bmiStatus);

    }

    public static double BMI(double weight, double feet, double inches) {

        final double kilogramsPerPound = 0.45359237;
        final double metersPerFeet = 0.3048;
        final double metersPerInch = 0.0254;

        double heightInMeter = (feet * metersPerFeet) + (inches * metersPerInch);
        weight *= kilogramsPerPound;

        return weight / Math.pow(heightInMeter, 2);
    }

    public static String BMIStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else if (bmi >= 30 && bmi < 35) {
            return "Class 1 obesity";
        } else if (bmi >= 35 && bmi < 40) {
            return "Class 2 obesity";
        } else {
            return "Class 3 obesity";
        }

    }

}
