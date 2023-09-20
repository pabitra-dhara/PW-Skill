public class ImplementInsertElementEnd {
    //node class
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int data){
            //crete new node
            Node temp=new Node(data);
            //if link list fully empty
            if(head==null){
            head=temp;
            }else{
                //list not empty
                tail.next=temp;
            }
            tail=temp;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

        void insertAttail(int data){
            Node temp=new Node(data);
            if(head==null) head=temp;
            else tail.next=temp;
            tail=temp;
        }
    }
    public static void main(String[] args) {
         linkedlist ll=new linkedlist();
         ll.insertAtEnd(5);
         ll.insertAtEnd(4);
         ll.display();
         System.out.println();
        //  System.out.println(ll.size());
        ll.insertAtEnd(9);
        ll.display();
        ll.insertAttail(50);
        ll.display();
    }
}
