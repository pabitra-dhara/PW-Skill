
public class StackUsingLinkedList {
   public static class Node{//user define data type
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Stack{//user define data structer
        private Node head=null;
        private int size=0;
        void push(int x){
            Node a=new Node(x);
            a.next=head;
            head=a;
            size++;
        }
        void displayrev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void displayhelp(Node h){
            if(h==null) return;
            displayhelp(h.next);
            System.out.print(h.data);
        }
        void display(){
            displayhelp(head);
        }
        int size(){
            return size;
        }
        int peek(){
            if(size==0){
                System.out.print("Stack Underflow!!!");
                return -1;
            }
            return head.data;
        }
        int pop(){
            if(size==0){
                System.out.print("Stack Underflow!!!");
                return -1;
            }
            int x=head.data;
            head=head.next;
            return x;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();// 1 2 3 4
        System.out.print(st.size());//4
        System.out.println(st.peek());//4 
        System.out.println(st.pop());//4
        st.display();
    }
}
