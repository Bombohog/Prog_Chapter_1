package Chapter_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void testExercise() {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);
        System.out.println("Distance from point 1 to point 2 is " + point1.distance(point2));
    }

    @Test
    void testDistanceMyPointArg() {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 10);
        assertEquals(14.14, point1.distance(point2), 0.01);
    }

    @Test
    void testDistanceXYArg() {
        MyPoint point1 = new MyPoint();
        assertEquals(14.14, point1.distance(10, 10), 0.01);
    }

    @Test
    void testDistanceStaticMyPointArgs() {
        assertEquals(14.14, MyPoint.distance(new MyPoint(), new MyPoint(10, 10)), 0.01);
    }

}