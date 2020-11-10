/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 10-11-2020
 *
 * Description of program
 ********************************************/

package Opg_11_2;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("bob");
        Student student = new Student("Lise", Student.Status.Freshman);
        Employee employee = new Employee("Lasse");
        Faculty faculty = new Faculty("Fredrik");
        Staff staff = new Staff("Christoffer");

        System.out.println(
                person.toString() + "\n" +
                student.toString() + "\n" +
                employee.toString() + "\n" +
                faculty.toString() + "\n" +
                staff.toString());

    }

}
