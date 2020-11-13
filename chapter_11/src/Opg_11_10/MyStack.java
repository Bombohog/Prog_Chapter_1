/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 13-11-2020
 *
 * Description of program
 ********************************************/

package Opg_11_10;

import java.util.ArrayList;

public class MyStack extends ArrayList {

    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    public String toString() {
        return "stack: " + list.toString();
    }

}
