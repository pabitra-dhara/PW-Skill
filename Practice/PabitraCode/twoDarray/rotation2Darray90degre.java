// import java.util.Scanner;

// public class rotation2Darray90degre {
//     static void transpose(int arr[][],int r,int c){
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 int temp=arr[i][j];
//                 arr[i][j]=arr[j][i];
//                 arr[j][i]=temp;
//             }
//         }
//     }
//     static void reverse(int arr[]){
//         int i=0;
//         int j=arr.length-1;
//         while(i<j){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;
//         }
//     }
//     static void rotation(int arr[][],int r,int c){
//         transpose(arr,r,c);
//         for(int i=0;i<r;i++){
//             reverse(arr[i]);
//         }
//     }
//     static void print(int arr[][]){
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Array Row Size:");
//         int r=sc.nextInt();
//         System.out.print("Enter Array Colums Size:");
//         int c=sc.nextInt();
//         System.out.println("Enter Array Element:");
//         int arr[][]=new int[r][c];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("90° Rotation:");
//         rotation(arr, r,c);
//         print(arr);
//     }
// }
import java.util.Scanner;
public class rotation2Darray90degre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;                
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][c-j-1];
                arr[i][c-j-1]=temp;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
