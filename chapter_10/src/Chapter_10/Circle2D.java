/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 06-11-2020
 *
 * Description of program
 ********************************************/

package Chapter_10;

// Opg. 10.11
public class Circle2D {

    private double x, y, radius;

    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public boolean contains(double x, double y) {
        if (Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2)) <= this.radius) { return true; } else { return false; }
    }

    public boolean contains(Circle2D circle) {
        if (Math.sqrt(Math.pow((circle.getX() - this.x), 2) + Math.pow((circle.getY() - this.y), 2)) <= this.radius) { return true; } else { return false; }
    }

    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow((circle.getX() - this.x), 2) + Math.pow((circle.getY() - this.y), 2));
        if (distance < this.radius + circle.getRadius()) { return true; } else { return false; }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

}
