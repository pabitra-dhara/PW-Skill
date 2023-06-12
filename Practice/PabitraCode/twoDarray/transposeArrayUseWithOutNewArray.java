import java.util.Scanner;
//Que:transpose with out extra array
public class transposeArrayUseWithOutNewArray {
    static void transpose(int arr[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("Transpose of Metrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Array Row Size:");
    int r=sc.nextInt();
    System.out.print("Enter Array Colume Size:");
    int c=sc.nextInt();

    System.out.println("Enter Array Element:");
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    transpose(arr, r, c);

}    
}