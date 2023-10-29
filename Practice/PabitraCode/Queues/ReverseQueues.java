import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueues {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println("Queues Element :"+q);
        Stack<Integer> st=new Stack<>();
        while(q.size()!=0){
            st.add(q.remove());
        }
        while(st.size()!=0){
            q.add(st.pop());
        }
        System.out.print("Queue Reverse:"+q);
    }
}
