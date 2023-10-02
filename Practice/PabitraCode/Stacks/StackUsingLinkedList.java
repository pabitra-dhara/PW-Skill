
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
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
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
            
            
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        System.out.print(st.size());
        System.out.println(st.peek());
    }
}
