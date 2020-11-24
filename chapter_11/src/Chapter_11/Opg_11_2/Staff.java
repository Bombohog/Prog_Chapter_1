/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 10-11-2020
 *
 * Description of program
 ********************************************/

package Chapter_11.Opg_11_2;

public class Staff extends Employee {

    private String title;

    public Staff(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Staff name: " + getName();
    }

}
