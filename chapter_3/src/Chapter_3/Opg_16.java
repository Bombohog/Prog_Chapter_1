/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 22-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_3;

import java.util.Random;

public class Opg_16 {

    public static void main(String[] args) {

        Random rand = new Random();

        double x = (rand.nextInt((25 - (-25)) + 1) - 25) + rand.nextDouble();
        double y = (rand.nextInt((57 - (-57)) + 1) - 75) + rand.nextDouble();

        System.out.println("The center for the rectangle is (0, 0) and its width is 50 and height = 150");
        System.out.println("A random point in the rectangle: (" + x + ", " + y + ")");

    }

}
