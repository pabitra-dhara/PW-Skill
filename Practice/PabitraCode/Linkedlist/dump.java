public class dump {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(int val,Node head){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
            head.next=null;
            return head;
        }else{
            temp.next=head;
        }
        head=temp;
        return head;
    }

    public static Node copy(Node head){
        Node temp=head;
        Node dup=new Node(100);
        Node t=dup;
        int size=0;
        while(temp!=null){
            size++;
            dup.next=temp;
            temp=temp.next;
            dup=dup.next;
        }
        dup=t.next;
        return dup; 
    }

    public static boolean palindrom(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=slow.next;
        Node rev=reverse(temp);
        slow.next=rev;
        Node p1=head;
        Node p2=slow.next;
        while(p2!=null){
            if(p1.data!=p2.data) return false;
            p1=p1.next;
            p2=p2.next;
        }
        return false;
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

    public static boolean palin(Node head){
        Node temp=head;
        Node temp1=head;
        // Node co=null;
        // co=copy(temp);
        
        Node re=null;
        re=reverse(copy(temp));
        while(re!=null && temp1!=null){
            if(re.data==temp1.data){
                re=re.next;
                temp1=temp1.next;
            }else{
                return false;
            }
        }
        return true;
    }

    public static Node reverse(Node head){
        Node c=head;
        Node n=c.next;
        Node p=null;

        while(c!=null){
            c.next=p;

            p=c;
            c=n;
            if(n!=null) n=n.next;
        }
        head.next=null;
        head=p;
        return head;
    }
    public static Node removeduplicate(Node head){
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(7);
        Node b=new Node(7);
        Node c=new Node(7);
        Node d=new Node(7);
        Node e=new Node(7);
        Node f=new Node(7);
        Node g=new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=null;
        // e.next=f;
        // f.next=null;
        // display(a);
        // a=insertAtHead(4, a);
        // a=insertAtHead(5, a);
        display(a);
        // Node ans=null;
        // ans=removeduplicate(a);
        //ans=reverse(a);
        //System.out.println(palin(a));
        //ans=palindrom(a);
       //display(ans);
    //    System.out.println(palindrom(a));
        Node ans=null;
        ans=removeElements(a,7);
        display(ans);
    }
}

