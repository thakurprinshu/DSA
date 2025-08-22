package linkedlist;

public class MergeLL {
    public static Node merge(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 != null) curr.next = l1;
        if (l2 != null) curr.next = l2;

        return dummy.next;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);


        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        Node merged = merge(l1, l2);

        printList(merged); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
    }
}

