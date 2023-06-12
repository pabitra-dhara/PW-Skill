import java.util.Scanner;

public class oneDarrayPrintInTwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Row Size:");
        int r=sc.nextInt();
        System.out.print("Enter Colume Size:");
        int c=sc.nextInt();

        int arr[]=new int[r*c];
        System.out.println("Enter 1D Array Element:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int arr2[][]=new int[r][c];
        int indx=0;
        System.out.println("1D Convert into 2D Array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print((arr2[i][j]=arr[indx++])+" ");
            }
            System.out.println();
        }



    }
}
