import java.util.Scanner;

// import java.util.Scanner;

// public class mergeSort {
//     static void merge(int arr[],int l,int mid,int r){
//         int merged[]=new int[r-l+1];
//         int idx1=l;
//         int idx2=mid+1;
//         int x=0;
//         while(idx1<=mid && idx2<=r){
//             if(arr[idx1]<=arr[idx2]){
//                 merged[x++]=arr[idx1++];
//             }else{
//                 merged[x++]=arr[idx2++];
//             }
//         }
//         while(idx1<=mid){
//             merged[x++]=arr[idx1++];
//         }
//         while (idx2<=r) {
//             merged[x++]=arr[idx2++];
//         }
//         for(int i=0,j=l;i<merged.length;i++,j++){
//             arr[j]=merged[i];
//         }
//     }
//     static void mergesort(int arr[],int l,int r){
//         if(l>=r)
//         return;

//         int mid=(l+r)/2;
//         mergesort(arr, l, mid);
//         mergesort(arr, mid+1, r);
//         merge(arr,l,mid,r);
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
//         mergesort(arr, 0, arr.length);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


public class mergeSort {
    static void displayArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void merge(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        //devide arr in two part
        int left[]=new int[n1];
        int right[]=new int[n2];
        
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=l;
        //file arr in sorting order
        while (i<n1&&j<n2) {
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }
        while (i<n1) {
            arr[k++]=left[i++];
        }
        while (j<n2) {
            arr[k++]=right[j++];
        }
    }
    static void mergeSortFunction(int arr[],int l,int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        mergeSortFunction(arr, l, mid);
        mergeSortFunction(arr, mid+1, r);
        merge(arr, l, mid, r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Arraya Size:");
        int size=sc.nextInt();
        System.out.println("Enter Arraya Element:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        mergeSortFunction(arr, 0, size-1);
        displayArr(arr);
    }
    
}