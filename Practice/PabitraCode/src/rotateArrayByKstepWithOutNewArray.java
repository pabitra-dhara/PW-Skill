 import java.util.Scanner;

// public class rotateArrayByKstepWithOutNewArray {

//     static void swapInArray(int arr[],int i,int j){
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;   
// }
//     static void revers(int arr[],int i,int j){
//         while(i<j){
//             swapInArray(arr, i, j);
//             i++;
//             j--;
//     }
// }
//     static void rotate(int arr[],int k){
//         int n=arr.length;
//         k=k%n;

//         revers(arr, 0, n-k-1);
//         revers(arr, n-k, n-1);
//         revers(arr, 0, n-1);
//     }

//     static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] +" ");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Array Size:");
//         int size=sc.nextInt();

//         System.out.println("Enter Array Element:");
//         int arr[]=new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("Enter Rotate Time:");
//         int k=sc.nextInt();


//         System.out.print("Print Original Arrays:");
//         printArray(arr);
//         System.out.println("Array After Rotation:");
//         rotate(arr,k);
//         printArray(arr);
//     }
// }


/**
 * rotateArrayByKstepWithOutNewArray
 */
public class rotateArrayByKstepWithOutNewArray {

    static void rotate(int arr[],int k){
        int n=arr.length;
        k=k%n;


        //array 1st part rotate
        for(int i=0;i<n-k;i++){
            int j=n-k-1;
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }

        //arr end part rotate
        for(int i=n-k;i<n;i++){
            int j=n-1;
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }                
            }


        for(int i=0;i<n;i++){
            int j=n-1;
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }             
            }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Entre Arrys Size:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter Arrays Element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter Rotate Time:");
        int k=sc.nextInt();

        rotate(arr, k);
    }
}