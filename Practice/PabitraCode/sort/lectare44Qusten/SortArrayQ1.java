package lectare44Qusten;

import java.util.Scanner;

public class SortArrayQ1 {
    static void sortArr(int arr[],int size){
        if(size<=1) return;
        int x=-1,y=-1;
        for(int i=1;i<size;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){
                  x=i-1; 
                  y=i; 
                }else{
                    y=i;
                }
            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void display(int arr[]){
        for(int var:arr){
            System.out.print(var+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size:");
        int size=sc.nextInt();
        System.out.println("Enter Array Element:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sortArr(arr, size);
        display(arr);
    }
}
