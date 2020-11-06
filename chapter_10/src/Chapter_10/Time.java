/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 28-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_10;

import java.util.Date;

// Opg. 10.1
public class Time {

    private long hour, minute, second;

    public Time() {
        long seconds = System.currentTimeMillis() / 1000;
        this.second = seconds % 60;
        this.minute = (seconds / 60) % 60;
        this.hour = (seconds / (60 * 60)) % 24 + 1;
    }

    public Time(long i) {
        Date date = new Date(i);
        this.hour = date.getHours();
        this.minute = date.getMinutes();
        this.second = date.getSeconds();
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        long seconds = elapseTime / 1000;
        this.second = seconds % 60;
        this.minute = (seconds / 60) % 60;
        this.hour = (seconds / (60 * 60)) % 24;
    }

}
