/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 21-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_9;

// Opg 8
public class Fan {

    private int speed;
    private boolean on;
    private double radius;
    public String color;
    enum Power{
        OFF (0),
        SLOW (1),
        MEDIUM (2),
        FAST (3);

        Power(int i) {
        }
    }

    public Fan() {
        this.speed = Power.SLOW.ordinal();
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        
        if (this.on) {
            
            String speedState = null;
            switch (this.speed) {
                case 0 -> speedState = Power.OFF.name();
                case 1 -> speedState = Power.SLOW.name();
                case 2 -> speedState = Power.MEDIUM.name();
                case 3 -> speedState = Power.FAST.name();
            }
            
            return "Fan\n Color: " + this.color + "\n Radius: " + this.radius + "\n On: " + this.on + "\n Speed: " + speedState;
        }
        else {return "Fan\n Color: " + this.color + "\n Radius: " + this.radius + ", the fan is off.";}
        
    }

}
