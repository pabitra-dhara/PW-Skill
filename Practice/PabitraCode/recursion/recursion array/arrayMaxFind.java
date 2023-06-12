import java.util.Scanner;
import java.lang.Math;
public class arrayMaxFind {
    static int  maxFind(int arr[],int i){
        if(i==arr.length){
            return 0;
        }
        int smalMax=maxFind(arr, i+1);
        return Math.max(arr[i], smalMax);
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

        System.out.println("Max Number is:"+maxFind(arr, 0));
    }
}
