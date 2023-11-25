import java.util.*;

public class sortLinkedList {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
        }
    }
    static ListNode sortList(ListNode head){
        int size=0;
        ListNode temp=head;
    }
    static void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
    ListNode a=new ListNode(-1);
    ListNode b=new ListNode(5);
    ListNode c=new ListNode(3);
    ListNode d=new ListNode(4);
    ListNode e=new ListNode(0);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    e.next=null;
    display(a);
    }
}
