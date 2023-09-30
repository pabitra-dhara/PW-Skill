import java.util.Scanner;
import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        while(gt.size()>0){
            int x=gt.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println(st);

        //use array print stack value
        int arr[]=new int[st.size()];
        for(int i=st.size();i<=1;i++){
            arr[i]=st.pop();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
