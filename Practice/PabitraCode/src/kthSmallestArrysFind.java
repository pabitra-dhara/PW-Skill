import java.util.Scanner;
import java.util.Arrays;

class kthNumberFinder{
    void find(int arr[],int x){
        Arrays.sort(arr);
        System.out.print("Array Sorted Form is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            if(i==x){
                System.out.print("Arrays "+x+" th Number Is :"+arr[i-1]);
            }
        }
    }
}

public class kthSmallestArrysFind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        System.out.print("Enter Array Element :");
        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter Arrys K th Number:");
        int x=sc.nextInt();

        kthNumberFinder obj1=new kthNumberFinder();
        obj1.find(arr,x);
    }
}
