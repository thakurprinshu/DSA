package SrchSort;

class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

class LinkedList {
    Node head;
    private Node getMiddle(Node start, Node end) {
        Node slow = start;
        Node fast = start;
        while (fast != end && fast.next != end) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean binarySearch(int key) {
        Node start = head;
        Node end = null;

        while (start != end) {
            Node mid = getMiddle(start, end);
            if (mid == null) return false;

            if (mid.data == key) return true;
            else if (mid.data < key) start = mid.next;
            else end = mid;
        }
        return false;
    }
}

public class BSLinkedlist {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(3);
        list.head.next.next = new Node(5);
        list.head.next.next.next = new Node(7);
        list.head.next.next.next.next = new Node(9);
        int key = 7;
        System.out.println("Search " + key + ": " + list.binarySearch(key));
    }
}
