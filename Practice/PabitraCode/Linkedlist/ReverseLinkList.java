public class ReverseLinkList {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
        }
    }
    public static ListNode reverse(ListNode head){
        if(head==null ||head.next==null) return head;
        ListNode c=head;
        ListNode n=c.next;
        ListNode p=null;

        while(c!=null){
            c.next=p;

            p=c;
            c=n;
            if(n!=null) n=n.next;
        }
        head=p;
        return head;
    }
    public static void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
    ListNode a=new ListNode(1);
    ListNode b=new ListNode(2);
    ListNode c=new ListNode(3);
    ListNode d=new ListNode(4);
    ListNode e=new ListNode(5);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    e.next=null;
    display(a);
    ListNode newHead=reverse(a);
    display(newHead);
    }
}
