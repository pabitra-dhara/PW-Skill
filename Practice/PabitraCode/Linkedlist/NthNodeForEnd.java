public class NthNodeForEnd {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
        public static Node nthNode(Node head,int n){
              int size=0;
              Node temp=head;
              while(temp!=null){
                  size++;
                  temp=temp.next;
              }
              temp=head;
              for(int i=1;i<size-n+1;i++){
                  temp=temp.next;
              }
              return temp;

        }
        static class linklist{
            Node head=null;
            Node tail=null;
            void insertAtEnd(int data){
                Node temp=new Node(data);
                if(head==null){
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
        }
    public static void main(String[] args) {
        linklist obj=new linklist();
        // obj.insertAtEnd(0);
        // obj.insertAtEnd(10);
        // obj.insertAtEnd(20);
        // obj.insertAtEnd(30);
        Node a=new Node(5);
        Node b=new Node(4);
        Node c=new Node(3);
        Node d=new Node(9);
        //linked node
        a.next=b;
        b.next=c;
        c.next=d;
        // obj.display();
        Node ans=nthNode(a, 2);
        System.out.println(ans.data);
    }
}
