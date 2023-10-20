public class RemoveEnterElement {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node removeElements(Node head, int val) {
        Node p=new Node(100);
        Node ans=p;
        Node c=head;
        int size=0;
        while(c!=null){
            size++;
            if(c.data==val){
                p.next=c.next;
                p=c;
                c=c.next;
            }else{
                p.next=c;
                p=c;
                c=c.next;
            }
        }
        if(size*val/val==size){
            Node s=null;
            return s;
        }
        return ans.next;
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
        ans=removeElements(a,8);
        display(ans);
    }
}
