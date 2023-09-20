public class DisplayLikedlistElement {
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void displayf(Node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        reversedisplay(head.next);
        
    }    
    
    public static void reversedisplay(Node head){
        if(head == null) return;
        reversedisplay(head.next);
        System.out.print(head.data+" ");
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(4);
        Node c=new Node(3);
        Node d=new Node(9);
        //linked node
        a.next=b;
        b.next=c;
        c.next=d;
        //use data
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);

        //use next.data
        System.out.println("---------------------------");
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);   
        System.out.println("----------------------------------");
        //display linklist value use for loop 
        Node temp=a;
        for(int i=1;i<5;i++){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println("------------------------");
        //display linkllist value using while loop
        Node tem=a;
        while(tem!=null){
            System.out.print(tem.data+" ");
            tem=tem.next;
        }
        //tempyrary node
        System.out.println();
        display(a);
        System.out.println();
        displayf(a);
        System.out.println();
        reversedisplay(a);
    }
    
}