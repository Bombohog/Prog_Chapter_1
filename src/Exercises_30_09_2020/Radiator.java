/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 29-09-2020
 *
 * Description of program
 ********************************************/

package Exercises_30_09_2020;

import org.w3c.dom.ls.LSOutput;

public class Radiator {

    public boolean onOff;
    public double temp;
    public double recentTemp;

    public Radiator(boolean onOff, double temp, double recentTemp) {
        this.onOff = onOff;
        this.temp = temp;
        this.recentTemp = recentTemp;
    }

    public void Status(boolean newStatus) {
        this.onOff = newStatus;
        if (this.onOff) {System.out.println("\nThe radiator is on\n");}
        else {System.out.println("\nThe radiator is off");}

    }

    public double setTemp(double newTemp) {
        if (!(this.onOff)) {
            this.onOff = true;
            System.out.println("\nRadiator is on\n");
        }
        this.temp = newTemp;
        RisingOrLowering();
        this.recentTemp = this.temp;
        return this.temp;
    }

    public void RisingOrLowering() {

        if (this.recentTemp < this.temp) {
            System.out.println("Temperature is rising to " + this.temp + " °C");
        } else if (this.recentTemp > this.temp) {
            System.out.println("Temperature is lowering to " + this.temp + " °C");
        } else {
            System.out.println("Temperature is constant/steady/still at " + this.temp + " °C");
        }

    }

}
