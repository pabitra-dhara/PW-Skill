import java.util.Scanner;
import java.util.Stack;

public class StackDeapCopy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Stacks Size:");
        int s=sc.nextInt();
        System.out.println("Enter Stacks Elements:");
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=s;i++){
            st.push(sc.nextInt());
        }
        Stack<Integer> cst=new Stack<>();
        while(st.size()>0){
            cst.push(st.pop());
        }
        System.out.println("reverse stack"+cst);
        Stack<Integer> dep=new Stack<>();
        while(cst.size()>0){
            dep.push(cst.pop());
        }
        System.out.println("duplicate stack:"+dep);
    }
}
