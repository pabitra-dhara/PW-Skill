import java.util.Scanner;

public class multiplicationOfTwoDArrays {
    static void matrixMul(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2){
        if(c1!=r2){
            System.out.println("Multiplication is Not Possible! Invalid Array Size Input!");
            return;
        }

        int sum[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    sum[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }


        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(sum[i][j] +" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Array Row Size:");
        int r1=sc.nextInt();
        System.out.print("Enter 1st Array Colum Size:");
        int c1=sc.nextInt();

        int arr1[][]=new int[r1][c1];
        System.out.println("Enter 1st Array Element:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter 2nd Array Row Size:");
        int r2=sc.nextInt();
        System.out.print("Enter 2nd Array Colum Size:");
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
        System.out.println("Enter 2nd Array Element:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Multiplicatin Of Array:");
        matrixMul(arr1, r1, c1, arr2, r2, c2);
    }
}