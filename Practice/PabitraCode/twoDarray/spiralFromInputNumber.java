import java.util.Scanner;
//Que:Spiral Eorm input element in 2 d array
public class spiralFromInputNumber {
    public static int[][] input(int n){
        int arr[][]=new int[n][n];
        int topRow=0,rightCol=n-1,bottomRow=n-1,leftCol=0;
        int k=1;
        
        while(k<=n*n){
            for(int j=leftCol;j<=rightCol && k<=n*n;j++){
                arr[topRow][j]=k++;
            }
            topRow++;

            for(int i=topRow;i<=bottomRow && k<=n*n;i++){
                arr[i][rightCol]=k++;
            }
            rightCol--;

            for(int j=rightCol;j>=leftCol && k<=n*n;j--){
                arr[bottomRow][j]=k++;
            }
            bottomRow--;

            for(int i=bottomRow;i>=topRow && k<=n*n;i--){
                arr[i][leftCol]=k++;
            }
            leftCol++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Arraye Size:");
        int n=sc.nextInt();

        int[][] arr=input(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
