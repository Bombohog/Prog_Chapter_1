/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 06-11-2020
 *
 * Description of program
 ********************************************/

package Chapter_10;

// Opg. 10.10
public class Queue {

    private int[] elements;
    private int size;

    public Queue() {
        this.size = 8;
        this.elements = new int[size];
    }

    void enqueue(int v) {

        for (int i = 0; i < elements.length; i++) {

            if (elements[i] == 0) {

                elements[i] = v;
                break;

            } else if (i == size - 1) {

                int[] oldArray = elements;
                elements = new int[this.size * 2];
                this.size = elements.length;


                for (int n = 0; n < oldArray.length; n++) {
                    elements[n] = oldArray[n];
                }

            }

        }

    }

    int dequeue() {

        int oldElement = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (i != size - 1) { elements[i] = elements[i + 1]; }
        }

        return oldElement;
    }

    boolean empty() {

        boolean empty = true;

        for (int currentElement: elements){
            if (currentElement != 0) { empty = false; break; }
        }

        if (empty) { return true; } else { return false; }

    }

    int getSize() {
        return size;
    }

}
