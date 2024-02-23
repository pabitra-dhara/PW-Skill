import java.util.Scanner;

public class BinarySearchUsingRecursion {
    public static boolean recbinearySearch(int arr[],int start,int end,int target){
        if(start>end){
            return false;
        }
        int mid=start+(end-start)/2;
        if(target==arr[mid]) return true;
        else if(target>arr[mid]) return recbinearySearch(arr, start+1, end, target);
        else return recbinearySearch(arr, start, end-1, target);
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
        System.out.println(recbinearySearch(arr, 0, size, k));
    }
}
