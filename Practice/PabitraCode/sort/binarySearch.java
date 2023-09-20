import java.util.Scanner;

public class binarySearch {
    static int searching(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                end=mid-1;
            }else{
                return start=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]={1,8,0,9};
        System.out.println(searching(arr, 3));
    }
}