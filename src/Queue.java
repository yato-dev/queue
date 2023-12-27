import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> queueList;

    public Queue() {
        this.queueList = new LinkedList<>();
    }

    public void enqueue(int data) {
        queueList.addLast(data);
    }

    public void dequeue() {
        if (!queueList.isEmpty()) {
            queueList.removeFirst();
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void display() {
        System.out.println(queueList);
    }

 
}
