import java.util.Scanner;
    //Que2:given a matrix 'a' of dimension n*m and 2 coondition (l1,r1)and (l2,r2).returm sum (l1,r1)and (l2,r2)
public class metrixSumFind1ForLoopLess {
    static void findPrefixSum(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
    }
    static int findSum(int arr[][],int l1,int r1,int l2,int r2){
        int sum=0;
        findPrefixSum(arr);
        for(int i=l1;i<=l2;i++){
            if(r1>=1){
                sum+=arr[i][r2]-arr[i][r1-1];
            }else{
                sum+=arr[i][r2];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Row Size:");
        int r=sc.nextInt();
        System.out.print("Enter Array Columes Size:");
        int c=sc.nextInt();

        int arr[][]=new int[r][c];
        System.out.println("Enter Array Element:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter L1 Value:");
        int l1=sc.nextInt();
        System.out.print("Enter r1 Value:");
        int r1=sc.nextInt();
        System.out.print("Enter L2 Value:");
        int l2=sc.nextInt();
        System.out.print("Enter r2 Value:");
        int r2=sc.nextInt();   
        
        System.out.print("Sum:"+ findSum(arr, l1, r1, l2, r2));
    }
}
