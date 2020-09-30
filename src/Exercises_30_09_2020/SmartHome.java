/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 29-09-2020
 *
 * Description of program
 ********************************************/

package Exercises_30_09_2020;

import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class SmartHome {

    public static Thermostat smartThermostat = new Thermostat();
    public static Radiator smartRadiator = new Radiator(false, 20.5, 20.5);

    public static void main(String[] args) throws InterruptedException {

        smartThermostat.tempLog.add(smartRadiator.temp);
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        smartThermostat.timeLog.add(df.format(dateobj));

        smartRadiator.Status(true);

        ChangeAndLog(22);

        TimeUnit.SECONDS.sleep(5);

        ChangeAndLog(22.5);

        TimeUnit.SECONDS.sleep(10);

        ChangeAndLog(24.2);

        TimeUnit.SECONDS.sleep(7);

        ChangeAndLog(25.7);

        TimeUnit.SECONDS.sleep(10);

        ChangeAndLog(26.6);

        TimeUnit.SECONDS.sleep(1);

        ChangeAndLog(26.6);

        TimeUnit.SECONDS.sleep(2);

        ChangeAndLog(26.1);

        TimeUnit.SECONDS.sleep(4);

        ChangeAndLog(25.5);

        TimeUnit.SECONDS.sleep(1);

        smartRadiator.Status(false);

        TimeUnit.SECONDS.sleep(2);

        ChangeAndLog(25.3);

        // at last the smart thermostat reviews the logs or lets you review them
        smartThermostat.ReviewLogs();

    }

    public static void ChangeAndLog(double newTemp) {

        smartThermostat.tempLog.add(smartRadiator.setTemp(newTemp));
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        smartThermostat.timeLog.add(df.format(dateobj));

        /* virkede ikke ved brug arrays
        // temperature
        double[] temporaryArray1 = smartThermostat.tempLog;
        smartThermostat.tempLog = new double[temporaryArray1.length + 1];
        smartThermostat.tempLog = temporaryArray1;
        smartThermostat.tempLog[temporaryArray1.length] = smartRadiator.setTemp(newTemp);

        // time
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        String[] temporaryArray2 = smartThermostat.timeLog;
        smartThermostat.timeLog = new String[temporaryArray2.length + 1];
        smartThermostat.timeLog = temporaryArray2;
        smartThermostat.timeLog[temporaryArray2.length] = df.format(dateobj);
        */

    }


}
