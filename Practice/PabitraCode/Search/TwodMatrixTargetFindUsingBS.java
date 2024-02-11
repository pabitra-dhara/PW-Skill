import java.util.Scanner;

public class TwodMatrixTargetFindUsingBS {

    public static boolean searchBS(int arr[][],int target){
        int n=arr.length;
        int m=arr[0].length;
        int st=0;
        int end=n*m-1;
        while (st<end) {
            int mid=st+(end-st)/2;
            int midEle=arr[mid/m][mid%m];
            if(midEle==target) return true;
            if(target<midEle){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row & Col Size:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Target Element:");
        int t=sc.nextInt();
        System.out.println(searchBS(arr, t));
    }
}
