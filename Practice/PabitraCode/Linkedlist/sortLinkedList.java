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
        ListNode temp=head;
        ArrayList<Integer> ar=new ArrayList<>();
        int size=0;
        while(temp!=null){
            size++;
            int s=temp.data;
            ar.add(s);
            temp=temp.next;
        }
        ListNode ans=null;
        for(int i=0;i<size;i++){
            for(int j=1;j<size-i;j++){
                if(ar.get(j-1)>ar.get(j)){
                    int t=ar.get(j-1);
                    ar.
                }
            }
        }
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
