package DoubleLinkedList;

import java.lang.annotation.Target;

public class TargetSumFindInLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static boolean sum(Node head,int terget){
        Node temp=head;
        Node tail=null;
        while(temp.next!=null){
            temp=temp.next;
        }
        tail=temp;
        Node temp1=head;
        while(temp1!=tail){
            int val=temp1.data+tail.data;
            if(val==terget){
                return true;
            }else if(val>terget){
                tail=tail.prev;
            }else if(val<terget){
                temp1=temp1.next;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
        f.next=null;
        System.out.println(sum(a, 7));
    }
}
