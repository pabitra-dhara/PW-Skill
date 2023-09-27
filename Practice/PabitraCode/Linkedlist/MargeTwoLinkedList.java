public class MargeTwoLinkedList {
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
    public static ListNode sortLinkedListUsingExtraSpace(ListNode head1,ListNode head2){
        ListNode temp1=head1;
        ListNode temp2=head2;
        ListNode temp=new ListNode(100);
        ListNode head=temp;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                ListNode a=new ListNode(temp1.data);
                temp.next=a;
                temp1=temp1.next;
            }else{
                ListNode a=new ListNode(temp2.data);
                temp.next=a;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        if(temp1==null){
            temp.next=temp2;
        }else{
            temp.next=temp1;
        }
        return head.next;
    }

    public static ListNode sortTwoLinkedListWithoutExtraSpace(ListNode head1,ListNode head2){
        ListNode temp1=head1;
        ListNode temp2=head2;
        ListNode temp=new ListNode(100);
        ListNode ans=temp;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                temp.next=temp1;
                temp1=temp1.next;
                
            }else{
                temp.next=temp2;
                temp2=temp2.next;
            }
            temp=temp.next;
        }

        if(temp1==null){
            temp.next=temp2;
        }else{
            temp.next=temp1;
        }
        
        return ans.next;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(10);
        ListNode b=new ListNode(11);
        ListNode c=new ListNode(12);
        ListNode d=new ListNode(13120);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        ListNode e=new ListNode(50);
        ListNode f=new ListNode(51);
        ListNode g=new ListNode(52);
        ListNode h=new ListNode(53);
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=null;
        // ListNode result=null;
        // result=sortTwoLinkedListWithoutExtraSpace(a, e);
        // display(result);
        ListNode ans=null;
        ans=sortLinkedListUsingExtraSpace(a, e);
        display(ans);
    
    }
}
