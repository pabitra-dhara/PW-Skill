import java.util.Scanner;

public class sortStringUseSelectionSort {
    static void lexicographicalSort(String arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[min_index])<0){
                    min_index=j;
                }
            }
            //arr[i] is big and arr[min-index] is sampler
            String temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        System.out.println("Enter Array Element:");
        String arr[]=new String[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.next();
        }
        //String arr[]={"apple","kiwi","lime","banana"};
        lexicographicalSort(arr);
        for(String val:arr){
            System.out.print(val+" ");
        }
    }
}

// public class sortStringUseSelectionSort {
//     static void sortFruits(String[] fruits){
//         int n = fruits.length;
//         for(int i = 0; i < n-1; i++){
//             int min_index = i;
//             for(int j = i+1; j < n; j++){
//                 if(fruits[j].compareTo(fruits[min_index]) < 0){
//                     min_index = j;
//                 }
//             }
//             // swap fruits[min_index], fruits[i]
//             String temp = fruits[i];
//             fruits[i] = fruits[min_index];
//             fruits[min_index] = temp;
//         }
//     }

//     public static void main(String[] args) {
//         String[] fruits = {"kiwi", "apple", "papaya", "mango"};
//         sortFruits(fruits);
//         for(String val : fruits){
//             System.out.print(val + " ");
//         }
//     }
// }