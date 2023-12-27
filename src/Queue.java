import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> queueList;

    public Queue() {
        this.queueList = new LinkedList<>();
    }

    public void enqueue(int data) {
        queueList.addLast(data);
    }

    public void display() {
        System.out.println(queueList);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);


        queue.display();
    }
}
