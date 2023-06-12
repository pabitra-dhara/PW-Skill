import java.util.Scanner;
public class frogJump {
    static int bestPath(int arr[],int n,int idx){
        if(idx==n-1){
            return 0;
        }
        int op1=bestPath(arr, n, idx+1)+Math.abs(arr[idx]-arr[idx+1]);
        if(idx==n-2){
            return op1;
        }
        int op2=bestPath(arr, n, idx+2)+Math.abs(arr[idx]-arr[idx+2]);
        return Math.min(op1, op2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Element:");
        int size=sc.nextInt();
        System.out.println("Enter Array Element:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int ans=bestPath(arr, size, 0);
        System.out.print("Minimum Possible cost:"+ans);
    }
}
