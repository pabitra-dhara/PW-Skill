import java.util.Scanner;

public class metrixSum {
    //Que1:given a matrix 'a' of dimension n*m and 2 coondition (l1,r1)and (l2,r2).returm sum (l1,r1)and (l2,r2)
    public static int SumFinder(int arr[][],int l1,int r1,int l2,int r2){
        int ans=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                ans+=arr[i][j];
            }
        }
        return ans;
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
        
        System.out.print("Sum is:"+ SumFinder(arr, l1, r1, l2, r2));
    }
}
