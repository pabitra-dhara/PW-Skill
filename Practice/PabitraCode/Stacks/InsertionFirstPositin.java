import java.util.Scanner;
import java.util.Stack;

public class InsertionFirstPositin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.println("Enter push element:");
        int e=sc.nextInt();
        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        st.push(e);
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
