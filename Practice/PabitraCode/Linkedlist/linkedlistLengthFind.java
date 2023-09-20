public class linkedlistLengthFind {
    public static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(12);
        Node b=new Node(13);
        Node c=new Node(14);
        Node d=new Node(15);
        Node e=new Node(16);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        System.out.println(length(a));
        
    }
}
