import java.util.Scanner;

import java.util.Stack;

public class PreviousSmallestElement {
    public static int[] smallest(int arr[]){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int pse[]=new int[n];
        st.push(arr[0]);
        pse[0]=-1;
        for(int i=1;i<n;i++){
            while(st.size()>0 && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.size()==0) pse[i]=-1;
            else pse[i]=st.peek();
            st.push(arr[i]);
        }
        return pse;
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
