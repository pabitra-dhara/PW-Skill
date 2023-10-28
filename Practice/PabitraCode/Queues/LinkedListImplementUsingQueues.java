public class LinkedListImplementUsingQueues {
  public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }  
public static class queues {
    Node head=null;
    Node tail=null;
    int size=0;
    public void add(int val){
        Node a=new Node(val);
        if(size==0){
            head=tail=a;
        }else{
            tail.next=a;
            tail=tail.next;
        }
        size++;
    }
    public int peek(){
        if(size==0){
            System.out.println("Queues Is Empty!");
            return -1;
        }
        return head.data;
    }
    public int remove(){
        if(size==0){
            System.out.println("Queues is Empty!");
            return -1;
        }
        int re=head.data;
        size--;
        head=head.next;
        return re;
    }

    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        queues obj=new queues();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.display();//1 2 3 4 5
        System.out.println(obj.peek());// 1
        System.out.println(obj.isEmpty());// false
        System.out.println(obj.remove());//1
        obj.display(); //2 3 4 5
    }
}
