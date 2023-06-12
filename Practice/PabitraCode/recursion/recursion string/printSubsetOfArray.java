import java.util.Scanner;

public class printSubsetOfArray {
    static void subset(int arr[],int s,int idx,int currsum){
        if(idx>=s){
            System.out.print(currsum+" ");
            return;
        }
        subset(arr, s, idx+1, currsum+arr[idx]);
        subset(arr, s, idx+1, currsum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Pass Array Size:");
        int s=sc.nextInt();
        System.out.println("Enter Array Element:");
        int arr[]=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        subset(arr, s, 0, 0);
    }
}
