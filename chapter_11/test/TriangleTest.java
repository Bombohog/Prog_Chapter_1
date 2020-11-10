import Opg_11_1.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle t;

    void setup() {
        t = new Triangle(2, 3, 2);
    }

    @Test
    void triangleConstructor1() {
        Triangle t2 = new Triangle();
        assertEquals(1.0, t2.getSide1());
        assertEquals(1.0, t2.getSide2());
        assertEquals(1.0, t2.getSide3());
        assertEquals(3.0, t2.getPerimeter());
    }

    @Test
    void triangleConstructor2() {
        Triangle t3 = new Triangle(1.0, 4.5, 2.0);
        assertEquals(1.0, t3.getSide1());
        assertEquals(4.5, t3.getSide2());
        assertEquals(2.0, t3.getSide3());
        assertEquals(7.5, t3.getPerimeter());
    }

    @Test
    void triangleArea() {
        setup();
        assertEquals(1.984, t.getArea(), 0.001);
    }

    @Test
    void triangleToString() {
        setup();
        assertEquals("Opg_11_1.Triangle: side1 = 2.0 side2 = 3.0 side3 = 2.0", t.toString());
    }

}