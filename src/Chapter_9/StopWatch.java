/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 17-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_9;

import java.sql.Time;

public class StopWatch {

    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void Start() {
        this.startTime = System.currentTimeMillis();
    }

    public void Stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long GetElapsedTime() {
        return this.endTime - this.startTime;
    }

}
