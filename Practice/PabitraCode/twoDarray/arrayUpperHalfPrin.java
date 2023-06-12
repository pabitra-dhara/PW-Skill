import java.util.Scanner;
//Que:Write a user defined function upper() which takes an integer square matrix as an input and its size N and prints the upper half of the matrix
public class arrayUpperHalfPrin {
    static void upperPrint(int arr[][],int r,int c){
        System.out.println("Array Upper Half Is:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i>j){
                   System.out.print(" ");
                }else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Row Size:");
        int r=sc.nextInt();
        System.out.print("Enter Array Columns Size:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter Array Element:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        upperPrint(arr, r, c);

    }
}
