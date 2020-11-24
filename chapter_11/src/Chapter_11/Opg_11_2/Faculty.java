/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 10-11-2020
 *
 * Description of program
 ********************************************/

package Chapter_11.Opg_11_2;

public class Faculty extends Employee {

    private double officeHours;
    private int rank;

    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Faculty name: " + getName();
    }

}
