import java.util.Scanner;
import java.util.*;
public class sumTriangleFromArray {
    static void printArray(int arr[]){
        if(arr.length<1){
            return;
        }
        int temp[]=new int[arr.length-1];
        int x;
        for(int i=0;i<arr.length-1;i++){
            x=arr[i]+arr[i+1];
            temp[i]=x;
        }
        printArray(temp);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array Element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        printArray(arr);
    }
}
