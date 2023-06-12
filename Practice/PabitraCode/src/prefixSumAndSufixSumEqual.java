import java.util.Scanner;
//Qus-:prefix sum and sufix sum is equal or not
public class prefixSumAndSufixSumEqual {
    static int sumFinder(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static boolean equalCheck(int arr[]){
        int total=sumFinder(arr);
        int prefix=0;
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            int sufixsum=total-prefix;
            if(prefix==sufixsum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("It:" + equalCheck(arr));
    }
}
