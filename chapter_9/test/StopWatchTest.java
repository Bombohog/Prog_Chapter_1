import Chapter_9.StopWatch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StopWatchTest {

    @Test
    void StopWatchTest() {
        StopWatch sw1 = new StopWatch();
        assertEquals(System.currentTimeMillis(), sw1.getStartTime());
    }

    @Test
    void getStartTimeTest() {
        StopWatch sw2 = new StopWatch();
        assertEquals(System.currentTimeMillis(), sw2.getStartTime());
    }

    @Test
    void getEndTimeTest() {
        StopWatch sw3 = new StopWatch();
        assertEquals(0, sw3.getEndTime());
    }

    @Test
    void startTest() throws InterruptedException {
        StopWatch sw4 = new StopWatch();
        sw4.Start();
        Thread.sleep(1000);
        assertNotEquals(System.currentTimeMillis(), sw4.getStartTime());
    }

    @Test
    void stopTest() throws InterruptedException {
        StopWatch sw5 = new StopWatch();
        sw5.Start();
        Thread.sleep(1000);
        sw5.Stop();
        assertEquals(System.currentTimeMillis(), sw5.getEndTime());
    }

    @Test
    void getElapsedTimeTest() throws InterruptedException {
        StopWatch sw6 = new StopWatch();
        sw6.Start();
        Thread.sleep(1000);
        sw6.Stop();
        assertNotEquals(0, sw6.GetElapsedTime());
    }

}