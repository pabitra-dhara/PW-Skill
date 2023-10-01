import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> s,int x){
        if(s.size()==0){ s.push(x); return;}
        int top=s.pop();
        pushAtBottom(s, x);
        s.push(top);
    }
    public static void reverceRec(Stack<Integer> s){
        if(s.size()==1) return;
        int top=s.pop();
        reverceRec(s);
        pushAtBottom(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Stack Size:");
        int s=sc.nextInt();
        System.out.println("Enter Stack Element:");
        for(int i=1;i<=s;i++){
            st.push(i=sc.nextInt());
        }
        System.out.println(st);
        reverceRec(st);
        System.out.println(st);
        // Stack<Integer> rs=new Stack<>();
        // while(st.size()>0){
        //    rs.push(st.pop());
        // }
        // System.out.println(rs);
    }
}
