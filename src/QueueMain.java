public class QueueMain {
    

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);


        queue.display();
         queue.dequeue();
         queue.display();
    }
}
