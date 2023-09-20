

public class insertEndElement {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static class linkedlist{
        Node head=null;
        Node tail=null;
        void insert(int data){
            Node temp=new Node(data);
            if(head==null) {
                head=temp;
            }else{
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

        void deleteAtIndex(int idx){
            Node temp=head;
            if(idx==0){
                head=temp.next;
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
        }
    }
    public static void main(String[] args) {
        linkedlist obj=new linkedlist();
        obj.insert(0);
        obj.insert(1);
        obj.insert(2);
        obj.deleteAtIndex(0);
        obj.display();
    }
}
