//use only sorted numbers 
public class removeduplicatedata {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node removeduplicate(Node head){
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(8);
        Node b=new Node(8);
        Node c=new Node(9);
        Node d=new Node(10);
        Node e=new Node(11);
        Node f=new Node(12);
        Node g=new Node(12);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=null;
        display(a);
        Node ans=null;
        ans=removeduplicate(a);
        display(ans);
    }
}
