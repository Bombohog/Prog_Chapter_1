/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 29-09-2020
 *
 * Description of program
 ********************************************/

package Exercises_30_09_2020;

import java.util.*;

public class Thermostat {

    public List<Double> tempLog = new ArrayList<>();
    public List<String> timeLog = new ArrayList<>();
    
    public void ReviewLogs() {

        System.out.println("\nLog:\n");

        for (int i = 0; i < this.tempLog.size(); i++) {
            String output = "Tempeture at " + this.timeLog.get(i) + " were " + this.tempLog.get(i) + " °C";
            if (this.tempLog.get(i) < 30 && this.tempLog.get(i) > 20) {
                System.out.println(output + "\nThe temperature is in its best state");
            } else {
                System.out.println(output + "\nThe temperature is not in its best state");
            }
            System.out.println(output);
        }

    }

}
