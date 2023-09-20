public class GetElementAnyIndex {
    
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
       void inserElementEnd(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
        }

        int getElement(int position){
            Node temp=head;
            for(int i=0;i<position;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public static void main(String[] args) {
        linkedlist obj=new linkedlist();
        obj.inserElementEnd(10);
        obj.inserElementEnd(20);
        obj.inserElementEnd(50);
        System.out.println("Find Element is:"+obj.getElement(2));
    }
}
