/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 06-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_4;

import java.util.Random;

public class Opg_6 {

    public static void main(String[] args) {

        // Gave up

        Random rand = new Random();

        final int radius = 40;
        final int centerx = 0;
        final int centery = 0;

        // point 1
        double alpha1 = Math.toRadians(rand.nextDouble() + (rand.nextInt((179) + 1)));
        double randomx1 = radius * Math.cos(alpha1);
        double randomy1 = radius * Math.sin(alpha1);

        // point 2
        double newMax = 179 - Math.toDegrees(alpha1);
        double alpha2 = Math.toRadians(rand.nextDouble() + (rand.nextInt(((int) newMax) + 1)));
        double randomx2 = radius * Math.cos(alpha2);
        double randomy2 = radius * Math.sin(alpha2);

         // point 3
        double alpha3;
        if (alpha1 > alpha2) {alpha3 = alpha1 - alpha2;}
        else {alpha3 = alpha2 - alpha1;}
        double randomx3 = radius * Math.cos(alpha3);
        double randomy3 = radius * Math.sin(alpha3);

        System.out.printf("Point 1 (x; y): %.2f ; %.2f \nPoint 2 (x; y): %.2f ; %.2f \nPoint 3 (x; y): %.2f ; %.2f" , randomx1, randomy1, randomx2, randomy2, randomx3, randomy3);
        System.out.println("\n" + Math.toDegrees(alpha1 + alpha2 + alpha3));

    }

}
