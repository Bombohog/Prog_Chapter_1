/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 05-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_4_Examples;

public class MathTests {

    public static void main(String[] args) {

        System.out.println(Math.rint(2.5));
        System.out.println(Math.abs(-2));
        System.out.println(Math.ceil(Math.random() * 6));

        int tal = (int)Math.ceil(Math.random() * 6);
        switch (tal) {
            case 1,2,3,4,5,6:
                System.out.println(tal);
                break;
            default:
                System.out.println("Fejl!");
        }

    }

}
