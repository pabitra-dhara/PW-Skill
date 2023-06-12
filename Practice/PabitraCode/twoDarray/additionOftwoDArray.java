import java.util.Scanner;
public class additionOftwoDArray {
    static void addition(int arr1[][],int arr2[][],int r1,int c1){
        int add[][]=new int[r1][c1];
        System.out.println("Array Addition:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print((add[i][j]=arr1[i][j]+arr2[i][j]) +" ");
            }
            System.out.println();
        }

    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Array Row Size:");
    int r1=sc.nextInt();
    System.out.print("Enter Array Columm Size:");
    int c1=sc.nextInt();
    int arr1[][]=new int[r1][c1];

    System.out.println("Enter 1st Array Element:");
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            arr1[i][j]=sc.nextInt();
        }
    }

    int arr2[][]=new int[r1][c1];
    System.out.println("Enter 2nd Array Element:");
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            arr2[i][j]=sc.nextInt();
        }
    }
    addition(arr1, arr2, r1, c1);
}
    
}