import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReorderQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        System.out.print("Enter Queue Size:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            q.add(sc.nextInt());
        }
        System.out.println("Original Queue:"+q);
        Stack<Integer> st=new Stack<>();
        while(q.size()!=n/2){
            st.add(q.remove());
        }
        while(st.size()!=0){
            q.add(st.pop());
        }
        while(q.size()!=n/2){
            st.add(q.remove());
        }
        while(st.size()!=0){
            int x=st.pop();
            q.add(x);
            int y=q.remove();
            q.add(y);
        }

        while(q.size()!=0){
            st.add(q.remove());
        }
        while(st.size()!=0){
            q.add(st.pop());
        }
        System.out.println("Ans: "+q);
    }
}
