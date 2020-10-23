import Chapter_9.RegularPolygon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularPolygonTestGeneration {

    RegularPolygon r1;

    @Test
    public void testRegularPolygon() {
        r1 = new RegularPolygon();
        assertEquals(3, r1.getN());
        assertEquals(1.0, r1.getSide());
        assertEquals(0.0, r1.getX());
        assertEquals(0.0, r1.getY());
    }

    @Test
    void getPerimeter() {
        r1 = new RegularPolygon(4, 2);
        assertEquals(8.0, r1.getPerimeter());
    }

    @Test
    void getArea() {
        r1 = new RegularPolygon(4, 2);
        assertEquals(4, (int) r1.getArea());
    }
}