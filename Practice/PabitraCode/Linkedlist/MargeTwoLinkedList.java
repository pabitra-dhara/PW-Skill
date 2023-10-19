public class MargeTwoLinkedList {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
        }
    }

    public static int reverse(int n){
        int re=0;
        while(n!=0){
            int digit=n%10;
            re=re*10+digit;
            n/=10;
        }
        return re;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        int val1=0;
        int val2=0;
        while(temp1!=null){
            int curr=temp1.data;
            val1=val1*10+curr;
            temp1=temp1.next;
        }
        while(temp2!=null){
            int curr=temp2.data;
            val2=val2*10+curr;
            temp2=temp2.next;
        }
        // int rev1=;
        // int rev2=;
        int ans=reverse(val1)+reverse(val2);
        //System.out.println(rev1+" "+rev2+" "+ ans);
        ListNode temp=new ListNode(100);
        ListNode d=temp;
        int rev=0;
        while(ans!=0){
            int digit=ans%10;
            ListNode a=new ListNode(digit);
            temp.next=a;
            temp=temp.next;
            rev*=10+digit;
            ans/=10;
        }
        return d.next;
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
        ListNode a=new ListNode(2);
        ListNode b=new ListNode(3);
        ListNode c=new ListNode(1);
        ListNode d=new ListNode(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(2);
        ListNode g=new ListNode(1);
        ListNode h=new ListNode(1);
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=null;
        // ListNode result=null;
        // result=sortTwoLinkedListWithoutExtraSpace(a, e);
        // display(result);
        ListNode ans=null;
        // ans=sortLinkedListUsingExtraSpace(a, e);
        // display(ans);
        ans=addTwoNumbers(a, e);
        display(ans);
    
    }
}
