import java.util.Scanner;

public class mergeSort {
    static void merge(int arr[],int l,int mid,int r){
        int merged[]=new int[r-l+1];
        int idx1=l;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=r){
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];
            }else{
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while (idx2<=r) {
            merged[x++]=arr[idx2++];
        }
        for(int i=0,j=l;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
    static void mergesort(int arr[],int l,int r){
        if(l>=r)
        return;

        int mid=(l+r)/2;
        mergesort(arr, l, mid);
        mergesort(arr, mid+1, r);
        merge(arr,l,mid,r);
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
        mergesort(arr, 0, arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
