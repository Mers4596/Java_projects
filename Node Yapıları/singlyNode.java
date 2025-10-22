public class singlyNode {
    
      static class Node{
        int data;
        Node next;

        Node(int a){
            data = a;
            next = null;
        
        }
      }

      public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node thirth = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.next = thirth;
        thirth.next = fourth;
        fourth.next = null;
      }
}
