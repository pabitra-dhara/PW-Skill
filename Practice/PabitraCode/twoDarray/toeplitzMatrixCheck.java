import java.util.Scanner;
/*Qus:Given a n*m matrix, return true if the matrix is a Toeplitz matrix. A matrix is called Toeplitz 
 if every diagonal from top-left to bottom-right has the same elements. */
public class toeplitzMatrixCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Row Size:");
        int r=sc.nextInt();
        System.out.print("Enter Array Colume Size:");
        int c=sc.nextInt();
        System.out.println("Enter Array Elment:");
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        checker(arr, r, c);
    }
    static void checker(int arr[][],int r,int c){
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(arr[i][j]!=arr[i-1][j-1]){
                    System.out.print("false");
                    return;
                }
            }
        }
        System.out.print("true");
    }
}
/*
 1 2 3 4
 5 1 2 3
 9 5 1 2
 */