import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
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
        Stack<Integer> rs=new Stack<>();
        while(st.size()>0){
           rs.push(st.pop());
        }
        System.out.println(rs);
    }
}
