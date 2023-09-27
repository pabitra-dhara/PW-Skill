public class DeleteMidileEmement {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
        }
    }

    public static void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static ListNode delete(ListNode head){
        //linked list size is 1 then it is execute
        if(head.next==null) return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(10);
        ListNode b=new ListNode(20);
        ListNode c=new ListNode(12);
        ListNode d=new ListNode(22);
        ListNode e=new ListNode(30);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        display(a);
        a=delete(a);
        display(a);
    }
}
