public class ImplementInsertElementBegin {
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
            void insertAtBegin(int data){
                Node temp=new Node(data);
                if(head==null){
                    head=tail=temp;
                    //insertAtEnd(data);
                }else{
                    temp.next=head;
                }
                head=temp;
            }

            void insertAt(int idx,int val){
                Node t=new Node(val);
                Node temp=head;
                //if try to insert element in end of list
                // if(idx==size()){
                //     inserAtEnd(val);
                //     return;
                // }
                //else 
                if(idx==0){
                    insertAtBegin(val);
                    return;
                }
                else if(idx<0 || idx>size()){
                    System.out.println("wrong index input");
                    return;
                }

                
                for(int i=1;i<=idx-1;i++){
                    temp=temp.next;
                }
                t.next=temp.next;
                temp.next=t;
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
        }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtBegin(45);
        ll.insertAtBegin(10);
        ll.insertAtBegin(15);
        ll.insertAtBegin(45);
        ll.insertAtBegin(100);
        ll.display();
        System.out.println();
        ll.insertAt(3,60);
        ll.display();
        ll.insertAt(0, 200);
        System.out.println();
        ll.display();
    }
}
