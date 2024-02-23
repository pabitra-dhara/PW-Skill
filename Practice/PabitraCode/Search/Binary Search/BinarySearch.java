import java.util.Scanner;

public class BinarySearch {
    static int Searching(int arr[],int k){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k){
                return mid;
            }else if(k<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
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
        System.out.print("Enter Searching Element:");
        int k=sc.nextInt();
        int n=Searching(arr, k);
        if(n<0){
            System.out.println("Element is not found!");
        }else{
            System.out.println("Element found is index no:"+n);
        }
    }
}