package Chapter_10;

class QueueTest {

    public static void main(String[] args) {

        Queue newQueue = new Queue();

        for (int i = 1; i <= 20; i++) { newQueue.enqueue(i); }
        System.out.println("Size of queue after 20 elements is " + newQueue.getSize() + "\n");

        for (int i = 1; i <= 20; i++) { System.out.println(newQueue.dequeue()); }

    }

}