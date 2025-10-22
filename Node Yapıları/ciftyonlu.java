public class ciftyonlu {
    
    static class Node {
        int data;
        Node next;
        Node previous;

        Node(int veri){
            data = veri;
            next = null;
            previous = null;
        }
    }

    public static void main(String[] args) {
        
        Node head = new Node(10);
        Node second = new Node(20);
        Node thirth = new Node(30);
        Node fourth = new Node(40);



        head.next = second;
        head.previous = null;

        second.next = thirth;
        second.previous = head;

        thirth.next = fourth;
        thirth.previous = second;

        fourth.next = null;
        fourth.previous = thirth;
    }

    



}
