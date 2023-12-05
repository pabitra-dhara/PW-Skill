import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class queueinterface {
    public static void priorityQueueExam(){
        //min priority queue
        //PriorityQueue<Integer> qe=new PriorityQueue<>();
        //max priority queue
        PriorityQueue<Integer> qe=new PriorityQueue<>(Comparator.reverseOrder());
        qe.add(1);
        qe.add(5);
        qe.add(2);
        qe.add(4);
        qe.add(3);
        System.out.println("PriorityQueue:");
        System.out.println(qe);
        System.out.println(qe.poll());
        System.out.println(qe);
        System.out.println(qe.peek());
    }
    //java linkedlist queue
    public static void QueueExem(){
        LinkedList<Integer> qu=new LinkedList<>();
        qu.offer(1);
        qu.offer(2);
        qu.offer(3);
        System.out.println("LinkedList Queue:");
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
        priorityQueueExam();
    }
}
