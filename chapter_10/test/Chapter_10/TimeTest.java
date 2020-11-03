/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 28-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeTest {

    @Test
    void TimeConstructor1() {
        Time currentTime = new Time();
        assertEquals(8, currentTime.getHour());
        assertEquals(32, currentTime.getMinute());
//        assertEquals(30, currentTime.getSecond()); // its not impossible to test this, but by the time the test runs the time is not the same (referring to seconds)
    }

    @Test
    void TimeConstructor2() {
        Time currentTime = new Time(10000L);
        assertEquals(1, currentTime.getHour());
        assertEquals(0, currentTime.getMinute());
        assertEquals(10, currentTime.getSecond());
    }

    @Test
    void TimeConstructor3() {
        Time currentTime = new Time(14, 45, 15);
        assertEquals(14, currentTime.getHour());
        assertEquals(45, currentTime.getMinute());
        assertEquals(15, currentTime.getSecond());
    }

    @Test
    void setTime() {
        Time currentTime = new Time();
        currentTime.setTime(555550000);
        assertEquals(10, currentTime.getHour());
        assertEquals(19, currentTime.getMinute());
        assertEquals(10, currentTime.getSecond());
    }

}
