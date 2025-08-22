 class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
 }
 public class Reverselist{
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr!=null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

 public static void printList(Node head) {
     Node temp = head;
     while (temp != null) {
         System.out.print(temp.data + " ");
         temp = temp.next;
     }
     System.out.println();
 }

 public static void main(String[] args) {

     Node head = new Node(1);
     head.next = new Node(2);
     head.next.next = new Node(3);
     head.next.next.next = new Node(4);

     System.out.println("Original List:");
     printList(head);

     head = reverse(head);

     System.out.println("Reversed List:");
     printList(head);
 }
}