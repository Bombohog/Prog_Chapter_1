/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 21-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_9;

import junit.framework.TestCase;

public class RegularPolygonTest extends TestCase{

    RegularPolygon r1;

    public void testRegularPolygon() {
        r1 = new RegularPolygon();
        assertEquals(3, r1.getN());
        assertEquals(1.0, r1.getSide());
        assertEquals(0.0, r1.getX());
        assertEquals(0.0, r1.getY());
    }

    public void testGetPerimeter() {
        r1 = new RegularPolygon(4, 2);
        assertEquals(8.0, r1.getPerimeter());
    }

    public void testGetArea() {
        r1 = new RegularPolygon(4, 2);
        assertEquals(4, (int) r1.getArea());
    }

}
