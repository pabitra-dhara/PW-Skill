package DoubleLinkedList;

public class DoubleLinkedListInsertAnyIndex {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static void insertAnyIndex(Node head,int idx,int x){
        Node s=head;
        for(int i=1;i<idx;i++){
            s=s.next;
        }
        Node r=s.next;
        Node t=new Node(x);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
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
        display(a);
        insertAnyIndex(a, 3, 9);
        display(a);
    }
}
