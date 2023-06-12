import java.util.Scanner;
//Qus: Given a n*m matrix, return an array of elements containing diagonal traversal of the matrix
public class diagonalTraversOfMatrix {
    static void travers(int arr[][],int r,int c){
        for(int i=0;i<r+c-1;i++){
            for(int j=0;j<c;j++){
                for(int k=0;k<c;k++){
                    if(j+k==i){
                        System.out.print(arr[k][j] +" ");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row Size:");
        int r=sc.nextInt();
        System.out.print("Enter Colume Size:");
        int c=sc.nextInt();
        System.out.println("Enter Array Element:");
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        travers(arr, r, c);
    }
}
