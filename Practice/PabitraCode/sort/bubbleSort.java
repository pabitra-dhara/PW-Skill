import java.util.Scanner;

public class bubbleSort {
    static void sort1(int arr[]){
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }                
            }
            if(flag==false){
                return;
            }
        }
    }
    static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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
        sort(arr);
        System.out.println("Sorted from of arrya:");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Best process Sort:");
        sort1(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}