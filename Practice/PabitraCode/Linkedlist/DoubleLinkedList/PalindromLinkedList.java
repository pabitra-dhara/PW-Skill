package DoubleLinkedList;

public class PalindromLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static boolean palindrom(Node head){
        Node tail=head;
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        tail=temp;
        Node temp1=head;
        while(temp1!=tail){
            if(temp1.data!=tail.data){
                return false;
            }
            temp1=temp1.next;
            tail=tail.prev;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(3);
        Node e=new Node(2);
        Node f=new Node(1);
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
        System.out.println(palindrom(a));
    }
}
