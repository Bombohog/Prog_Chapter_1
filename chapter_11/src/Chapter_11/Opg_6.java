package Chapter_11; /********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 13-11-2020
 *
 * Description of program
 ********************************************/

import Chapter_10.Circle2D;
import Chapter_11.Opg_11_3.Account;

import java.util.ArrayList;
import java.util.Date;

public class Opg_6 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(new Account());
        list.add(new Date());
        list.add(new Circle2D());

        // Calls the toString() method from the superclass Object
        for (Object current : list) { System.out.println(current.toString()); }
        System.out.println("\n");
        // Calls the toString() method from the classes of each object in the list
        for (Object current : list) { System.out.println(current.getClass().toString()); }

    }

}
