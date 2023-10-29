import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueInFirstKElement {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        int k=3;
        while(q.size()>k){
            st.add(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }

        int s=q.size();
        Queue<Integer> q2=new LinkedList<>();
        while(q.size()>s-k){
            q2.add(q.remove());
        }
        while(q2.size()!=0){
            q.add(q2.remove());
        }
        System.out.println(q);
    }
}
