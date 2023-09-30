import java.util.Scanner;
import java.util.Stack;

public class StackBasic {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("Enter Stacks Size:");
        size=sc.nextInt();
        System.out.println("Enter Stacks elements:");
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=size;i++){
            st.push(sc.nextInt());
        }
        System.out.println("pop element :"+st.pop());
        System.out.println(st);
        System.out.println("peek element:"+st.peek());
        System.out.println(st);
    }
}