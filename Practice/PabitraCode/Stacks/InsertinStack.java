import java.util.Scanner;
import java.util.Stack;

public class InsertinStack {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original Stack:"+st);
        System.out.print("Enter Insert Index:");
        int idx=sc.nextInt();
        System.out.print("Enter Insert Element:");
        int ele=sc.nextInt();
        if(idx>st.size()){
            throw new IndexOutOfBoundsException("Stack Index is Greter then Stack Size!!!!!!!!");
        }
        Stack<Integer> gt=new Stack<>();
        while(st.size()>idx){
            gt.push(st.pop());
        }
        st.push(ele);
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.print(st);
    }
}
