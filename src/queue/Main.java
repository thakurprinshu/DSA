package queue;

public class Main {
    public static void main(String[] args) {
        QueueImplement q = new QueueImplement();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());


        q.enqueue(40);
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());

        System.out.println("Is Queue Empty? " + q.isEmpty());
    }
}
