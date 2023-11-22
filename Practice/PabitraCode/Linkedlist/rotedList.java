public class rotedList {
        public ListNode rotateRight(ListNode head, int k) {
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
   public static void main(String[] args) {
       
   }