package lectare44Qusten;

import java.util.Scanner;

public class Sort012SMainQ3 {
    public static void sort012Q3(int a[]){
        int low=0;
        int mid=0;
        int hi=a.length-1;
        //explor the unknown region
        while(mid<=hi){
            if(a[mid]==0){
                swap(a, mid, low);
                mid++;
                low++;
            }else if(a[mid]==1){
                mid++;
            }else{
                swap(a, mid, hi);
                hi--;
            }
        }
    }
    public static void display(int arr[]){
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    static void swap(int a[],int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        System.out.println("Enter Array Element Only 0 1 2 s:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
          sort012Q3(arr);
          display(arr);
        
    }
}
