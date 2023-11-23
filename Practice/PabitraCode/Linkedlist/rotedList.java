public class rotedList {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
        }
    }
        public static ListNode rotateRight(ListNode head, int k) {
            if(head==null || head.next==null || k==0){
                return head;
            }
    
            int size=1;
            ListNode fake=head;
            while(fake.next!=null){
                size++;
                fake=fake.next;
            }
            k=k%size;
            k=size-k;
            fake.next=head;
            while(k!=0){
                fake=fake.next;
                k--;
            }
            head=fake.next;
            fake.next=null;
            return head;
        } 
        public static void display(ListNode head){
            ListNode temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
   public static void main(String[] args) {
    ListNode a=new ListNode(1);
    ListNode b=new ListNode(2);
    ListNode c=new ListNode(3);
    ListNode d=new ListNode(4);
    ListNode e=new ListNode(5);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    e.next=null;
    display(a);
    ListNode newHead=rotateRight(a,2);
    display(newHead);
   }
}