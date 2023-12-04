import java.util.LinkedList;

public class queueinterface {
    //java linkedlist queue
    public static void QueueExem(){
        LinkedList<Integer> qu=new LinkedList<>();
        qu.offer(1);
        qu.offer(2);
        qu.offer(3);
        System.out.println(qu);
        System.out.println(qu.peek());
        System.out.println(qu.poll());
        System.out.println(qu.peek());
        System.out.println(qu.isEmpty());
        System.out.println(qu.size());
        System.out.println(qu.remove());
        System.out.println(qu);
    }
    public static void main(String[] args) {
        QueueExem();
    }
}
