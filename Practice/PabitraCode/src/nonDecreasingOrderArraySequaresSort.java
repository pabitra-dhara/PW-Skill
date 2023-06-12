 import java.util.Scanner;
//qus-:non decreasing order arrays sort and array square find
public class nonDecreasingOrderArraySequaresSort {
static void reverse(int ans[]){
    int j=ans.length-1;
    int i=0;
    while(i<j){
        int temp=ans[i];
        ans[i]=ans[j];
        ans[j]=temp;
        i++;
        j--;
    }
    for(int k=0;k<ans.length;k++){
        System.out.print(ans[k] + " ");
    }
}

    static int[] sequareFinder(int arr[]){
        int left=0;
        int right=arr.length-1;
        int ans[]=new int[arr.length];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
            public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter Non-Decreasing Arrays Element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int ans[]=sequareFinder(arr);
        reverse(ans);
    }
}


//non decreasing order array seqare find without reverse 
// public class nonDecreasingOrderArraySequaresSort {

//     static int[] sequareFinder(int arr[]){
//         int left=0;
//         int right=arr.length-1;
//         int  k=arr.length-1;
//         int ans[]=new int[arr.length];
//         while(left<=right){
//             if(Math.abs(arr[left])<Math.abs(arr[right])){
//                 ans[k--]=arr[right]*arr[right];
//                 right--;
//             }else{
//                 ans[k--]=arr[left]*arr[left];
//                 left++;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Array Size:");
//         int size=sc.nextInt();

//         int arr[]=new int[size];
//         System.out.println("Enter Non-Decreasing Arrays Element:");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
        
//         int ans[]=sequareFinder(arr);
//         for(int i=0;i<size;i++){
//             System.out.print(ans[i] + " ");
//         }
//     }
// }
