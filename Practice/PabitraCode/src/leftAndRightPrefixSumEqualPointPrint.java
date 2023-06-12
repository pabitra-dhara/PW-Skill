import java.util.Scanner;
public class leftAndRightPrefixSumEqualPointPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left[]=new int[n];
        left[0]=0;
        int right[]=new int[n];
        right[n-1]=0;

        for(int i=1;i<n;i++){
            left[i]=left[i-1]+arr[i-1];
        }

        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+arr[i+1];
        }
        for(int i=0;i<n;i++){
            if(right[i]==left[i]){
                System.out.print(i);
                return;
            }
        }
        System.out.print(-1);        
    }
}
