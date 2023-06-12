import java.util.Scanner;
import java.util.ArrayList;
public class linearSearchPrintEveryIndex {
    static ArrayList<Integer> finder(int arr[],int terget,int idx,int n){
        ArrayList<Integer>ans=new ArrayList<>();
        if(idx>=n){
            return ans;
        }
        if(terget==arr[idx]){
            ans.add(idx);
        }
         ArrayList<Integer> smallAns=finder(arr, terget, idx+1,n);
         ans.addAll(smallAns);
         return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        System.out.println("Enter Array Element:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Finde Element:");
        int terget=sc.nextInt();
        int n=arr.length;
        ArrayList<Integer> index=finder(arr, terget, 0,n);
        for(Integer i:index){
            System.out.print(i+" ");
        }
    }
}


// public class linearSearchPrintEveryIndex {
//     static int[] indexPrint(int arr[],int terget,int idx){
        
//         if(terget>=idx){
//             int ans[]=new int[0];
//             return ans;
//         }
//         if(terget==arr[idx]){
//             System.out.print(idx);
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
//         System.out.print("Enter Searching Element:");
//         int terget=sc.nextInt();

//     }
// }
