/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 21-10-2020
 *
 * Description of program
 ********************************************/

import Chapter_9.QuadraticEquation;
import junit.framework.TestCase;

public class QuadraticEquationTest extends TestCase {

    QuadraticEquation q1;

    public void testQuadraticEquation() {
        q1 = new QuadraticEquation(2, 2, 2);
        assertEquals(2, q1.getA(), 0);
        assertEquals(2, q1.getB(), 0);
        assertEquals(2, q1.getC(), 0);
    }

    public void testGetDiscriminant() {
        q1 = new QuadraticEquation(2, 5, 2);
        assertEquals(9, q1.getDiscriminant(), 0);
    }

    public void testGetRoots() {
        q1 = new QuadraticEquation(2, 5, 2);
        assertEquals(-0.5, q1.getRoot1(), 0.01);
        assertEquals(-2, q1.getRoot2(), 0.01);
    }

}
