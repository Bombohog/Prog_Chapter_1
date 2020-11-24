/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 10-11-2020
 *
 * Description of program
 ********************************************/

package Chapter_11.Opg_11_2;

public class Student extends Person {

    enum Status {
        Freshman,
        Sophmore,
        Junior,
        Senior;
    }
    private final Status status;

    public Student(String name, Status status) {
        super(name);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student name: " + getName();
    }

}
