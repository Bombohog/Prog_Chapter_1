/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 21-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_9;

public class RegularPolygonMain {

    public static void main(String[] args) {

        RegularPolygon r2 = new RegularPolygon();
        RegularPolygon r3 = new RegularPolygon(6, 4);
        RegularPolygon r4 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.printf("Polygon A(no-arg):\nPerimeter: %.2f\nArea: %.2f\n", r2.getPerimeter(), r2.getArea());
        System.out.printf("Polygon B(two-arg):\nPerimeter: %.2f\nArea: %.2f\n", r3.getPerimeter(), r3.getArea());
        System.out.printf("Polygon C(four-arg):\nPerimeter: %.2f\nArea: %.2f\n", r4.getPerimeter(), r4.getArea());

    }

}
