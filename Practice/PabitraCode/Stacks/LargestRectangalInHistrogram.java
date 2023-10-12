import java.util.Scanner;
import java.util.Stack;

public class LargestRectangalInHistrogram {
    public static int largestRectangleArea(int height[]){
        Stack<Integer> st=new Stack<>();
        int n=height.length;
        int nse[]=new int[n];
        int pse[]=new int[n];

        st.push(n-1);
        nse[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && height[st.peek()]>=height[i]){
                st.pop();
            }
            if(st.size()==0) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        while(st.size()>0) st.pop();

        st.push(0);
        pse[0]=-1;
        for(int i=1;i<n;i++){
            while(st.size()>0 && height[st.peek()]>=height[i]){
                st.pop();
            }
            if(st.size()==0) pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
        int max=-1;
        for(int i=0;i<n;i++){
            int area=height[i]*(nse[i]-pse[i]);
            max=Math.max(max, area);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Arraya Size:");
        int s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("Enter Arraya Elements:");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Max Rectangle Area:"+largestRectangleArea(arr));
    }
}
