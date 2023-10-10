import java.util.Scanner;
import java.util.Stack;

public class NextSmallestElement {
    public static int[] smallest(int arr[]){
        int n=arr.length;
        int res[]=new int[n];
        Stack<Integer> st=new Stack<>();
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()>arr[i]){
                st.pop();
            }
            if(st.size()==0) res[i]=-1;
            else res[i]=st.peek();
            
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Arraya Size:");
        int s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("Enter Arraya Element:");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int res[]=smallest(arr);
        for(int val:res){
            System.out.print(val+" ");
        }
    }
}
