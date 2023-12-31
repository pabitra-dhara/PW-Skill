package lectare44Qusten;

import java.util.Scanner;

public class SortPositiveNegativeQ2 {
    public static void display(int arr[]){
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void sortnagetivepositive(int arr[]){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            // while(arr[l]<0){
            //     l++;
            // }
            // while(arr[r]>0){
            //     r--;
            // }
            if(arr[l]<0) l++;
            if(arr[r]>0) r--;
            if(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
        }
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
        sortnagetivepositive(arr);
        display(arr);
    }
}
