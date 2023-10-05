import java.util.Scanner;
import java.util.Stack;

public class RemoveConsectiveSubsequences {
    public static int[] remove(int arr[]){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.size()==0 || st.peek()!=arr[i]){
                st.push(arr[i]);
            }else if(arr[i]==st.peek()){
                if(arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int res[]=new int[st.size()];
            for(int i=st.size()-1;i>=0;i--){
                res[i]=st.pop();
            }
            return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Arraya Size:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=remove(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
