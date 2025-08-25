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


//CircularQueue
        Circularqueue cq = new Circularqueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        System.out.println("Dequeued: " + cq.dequeue());
        System.out.println("Dequeued: " + cq.dequeue());
        cq.enqueue(50);
        cq.enqueue(60);
        cq.enqueue(70);
        System.out.println("Front element: " + cq.peek());


    }
}
