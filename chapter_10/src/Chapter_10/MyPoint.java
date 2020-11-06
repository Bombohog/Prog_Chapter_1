/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 06-11-2020
 *
 * Description of program
 ********************************************/

package Chapter_10;

// Opg. 10.4
public class MyPoint {

    private double x, y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint otherPoint) {
        return Math.sqrt(Math.pow((otherPoint.getX() - this.x), 2) + Math.pow((otherPoint.getY() - this.y), 2));
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }

    public static double distance(MyPoint point1, MyPoint point2) {
        return Math.sqrt(Math.pow((point2.getX() - point1.getX()), 2) + Math.pow((point2.getY() - point1.getY()), 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
