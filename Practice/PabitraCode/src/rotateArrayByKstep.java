// import java.util.Scanner;

// public class rotateArrayByKstep {

//     static int[] rotate(int arr[],int k){
//         int n=arr.length;
//         k=k%n;
//         int j=0;
//         int ans[]=new int[n];
        
//         for(int i=n-k;i<n;i++){
//             ans[j++]=arr[i];
//         }        
//         for(int i=0;i<n-k;i++){
//             ans[j++]=arr[i];
//         }
//         return ans;
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

//         int arr[]=new int[size];
//         System.out.print("Enter Array Element:");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }

//         System.out.print("Enter Array Rotate Time:");
//         int k=sc.nextInt();


       

//         System.out.print("Original Array:");
//         printArray(arr);
//         System.out.println();
        
//         System.out.println("Array after Rotation:");
//         printArray(rotate(arr, k)); 

//     }
// }
import java.util.Scanner;

public class rotateArrayByKstep {

    static void rotate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        int j=0;
        int ans[]=new int[n];
        
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }        
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
               for(int i=0;i<arr.length;i++){
            System.out.print(ans[i] +" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.print("Enter Array Element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter Array Rotate Time:");
        int k=sc.nextInt();


       

        System.out.print("Original Array:");
        System.out.println();
        
        System.out.println("Array after Rotation:");
       rotate(arr, k); 

    }
}