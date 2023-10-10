import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] greaterEle(int arr[]){
        int n=arr.length;
        int res[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0) res[i]=-1;
            else res[i]=st.peek();


            //it all ways true
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Arraya size:");
        int s=sc.nextInt();
        System.out.println("Enter arraya Element:");
        int arr[]=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=greaterEle(arr);
        for(int val:ans){
            System.out.print(val+" ");
        }
    }
}
