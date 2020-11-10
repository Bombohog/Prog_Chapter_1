/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 06-11-2020
 *
 * Description of program
 ********************************************/

package Chapter_10;

public class Triangle2D {

    private MyPoint p1, p2, p3;

    public Triangle2D() {
        p1 = new MyPoint();
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea() {
        return 0.5 * (p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY() - p2.getY()));
    }

    public double getPerimeter() {

        double side1 = p1.distance(p2);
        double side2 = p2.distance(p3);
        double side3 = p3.distance(p1);

        return side1 + side2 + side3;
    }

    public boolean contains(MyPoint p) {

        /*
        p1 = A, p2 = B, p3 = C
        Punktet P ligger indenfor eller på trekant ABC hvis

        vinkel BAP <= vinkel A  og  vinkel CAP <= vinkel A
        vinkel ABP <= vinkel B  og  vinkel CBP <= vinkel B
        vinkel ACP <= vinkel C  og  vinkel BCP <= vinkel C
        */
        double sideC = p1.distance(p2);
        double sideA = p2.distance(p3);
        double sideB = p3.distance(p1);
        double vinkelA = Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC));
        double vinkelB = Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC));
        double vinkelC = Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB));
        double sideAP = p.distance(p1);
        double sideBP = p.distance(p2);
        double sideCP = p.distance(p3);
        double vinkelABP = Math.acos((Math.pow(sideBP, 2) + Math.pow(sideCP, 2) - Math.pow(sideA, 2)) / (2 * sideBP * sideCP));
        double vinkelACP = Math.acos((Math.pow(sideAP, 2) + Math.pow(sideCP, 2) - Math.pow(sideB, 2)) / (2 * sideAP * sideCP));
        double vinkelCBP = Math.acos((Math.pow(sideAP, 2) + Math.pow(sideBP, 2) - Math.pow(sideC, 2)) / (2 * sideAP * sideBP));

        if (vinkelABP <= vinkelA && vinkelACP <= vinkelA) { return true; }
        else if (vinkelABP <= vinkelB && vinkelCBP <= vinkelB) { return true; }
        else if (vinkelACP <= vinkelC && vinkelCBP <= vinkelC) { return true; }
        else { return false; }

    }

    /*// TODO
    public boolean contains(Triangle2D t) {
        if () { return true; } else { return false; }
    }
    // TODO
    public boolean overlaps(Triangle2D t) {

        // check om hver a t's punkter er inde i denne trekant
        if () { return true; } else { return false; }

    }*/

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

}
