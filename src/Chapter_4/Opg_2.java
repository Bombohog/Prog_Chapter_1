/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 06-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_4;

import java.util.Scanner;

public class Opg_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double lat1 = Math.toRadians(input.nextDouble());
        double long1 = Math.toRadians(input.nextDouble());
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double lat2 = Math.toRadians(input.nextDouble());
        double long2 = Math.toRadians(input.nextDouble());

        final double radius = 6371.01;

        double d = radius * Math.acos((Math.sin(lat1) * Math.sin(lat2)) + (Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2)));

        System.out.printf("The distance between the two points is %f km", d);

    }

}
