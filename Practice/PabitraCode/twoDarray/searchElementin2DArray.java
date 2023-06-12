import java.util.Scanner;

public class searchElementin2DArray {
    static void finder(int arr[][],int r,int c,int x){
        int flag=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(x==arr[i][j]){
                    System.out.print("Element Find Row No:"+ i +" Column No:" + j);
                    flag++;
                }
            }
        }
        if(flag==0){
            System.out.print(-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row Size:");
        int r=sc.nextInt();
        System.out.print("Enter Columm Size:");
        int c=sc.nextInt();

        System.out.println("Enter Array Element:");
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter Your Searching Element:");
        int x=sc.nextInt();

        finder(arr, r, c, x);
    }
}
