public class removeLinkedListElement {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node removeElements(Node head, int data) {
        if(head==null)return head;
        Node c=head;
        Node t=new Node(100);
        Node ans=t;
        Node n=head.next;
        while(c!=null){
            if(n.val==data){
                Node a=new Node(n.next.val);
                t=a;
                if(n!=null)n=n.next;
                t=t.next;
                c=c.next;
            }else{
                Node a=new Node(c.val);
                t=a;
                if(n!=null)n=n.next;
                t=t.next;
                c=c.next;
            }
        }
        return ans.next;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(6);
        Node d=new Node(3);
        Node e=new Node(4);
        Node f=new Node(5);
        Node g=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=null;
        display(a);
        Node ans=null;
        ans=removeElements(a, 6);
        display(ans);
    }
}
