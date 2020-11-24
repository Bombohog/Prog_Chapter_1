/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 10-11-2020
 *
 * Description of program
 ********************************************/

package Chapter_11.Opg_11_2;

import java.util.Date;

public class Employee extends Person {

    private double office; // etage.lokaleNummmer
    private double salary;
    private Date dateHired;

    public Employee(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Employee name: " + getName();
    }

}
