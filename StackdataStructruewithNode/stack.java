package StackdataStructruewithNode;

public class stack {
    
    // ÖDEV Bağlı liste ile Stack Yapısı
    static class Node
    {
        int data;
        Node next;


        Node(int a){
            data = a;
            next = null;
        }
    }

    static class myStack{
        Node top;
        int count;

        myStack(){
            top = null;
            count = 0;
        }

        void push(int element){
            Node temp = new Node(element);
            temp.next = top;
            top = temp;
            count++;
        }

        int pop(){
            if(top == null){
                System.out.println("Stack Underflow");
            }
            
            Node temp = top;
            top = top.next;
            int val = temp.data;
            
            count--;
            return val;
        }

        int peek(){
            return top.data;
        }

        void print(){

            Node current = top;

            System.out.print("[" );
            while(current != null){

                System.out.print(current.data + " " );
                current = current.next;

            }
            System.out.println("] <- Top number" + peek() + ")");

        }


    }

    public static void main(String[]  args)
    {
        myStack stk = new myStack();

        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        stk.print();


        stk.pop();
        stk.print();

        stk.pop();
        stk.print();

        stk.peek();
    }




}
