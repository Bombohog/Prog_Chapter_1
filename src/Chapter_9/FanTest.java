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

public class FanTest extends TestCase {

    Fan f1;

    public void setup() {
        f1 = new Fan();
    }

    public void testFan() {
        f1 = new Fan();
        assertEquals(1, f1.getSpeed());
        assertFalse(f1.isOn());
        assertEquals((double) 5, f1.getRadius());
        assertEquals("blue", f1.color);
    }

    public void testToString() {
        setup();
        assertEquals("Fan\n Color: blue\n Radius: 5.0, the fan is off.", f1.toString());
        f1.setOn(true);
        assertEquals("Fan\n Color: blue\n Radius: 5.0\n On: true\n Speed: SLOW", f1.toString());
    }



}
