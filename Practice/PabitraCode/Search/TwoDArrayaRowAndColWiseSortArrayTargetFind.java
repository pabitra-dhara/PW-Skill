import java.util.Scanner;

public class TwoDArrayaRowAndColWiseSortArrayTargetFind {
    public static boolean searchTarget(int arr[][],int t){
        int n=arr.length,m=arr[0].length;
        int i=0,j=m-1;
        while(i<n && j>=0){
            if(t==arr[i][j]) return true;
            if(t<arr[i][j]){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("Enter Array Element:");
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter Target Element:");
        int target=sc.nextInt();
        System.out.println(searchTarget(arr, target));
    }
}
