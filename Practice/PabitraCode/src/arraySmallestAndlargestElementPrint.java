import java.util.Scanner;
import java.util.Arrays;
class finder{
    void find(int arr[]){
        Arrays.sort(arr);
        System.out.print("Arrays Sorted Form is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int ans[]={arr[0],arr[arr.length-1]};
        System.out.print("Array Sammelest And Largest Element Is :"+ ans[0]+","+ans[1]);
    }
}

public class arraySmallestAndlargestElementPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        System.out.println("Enter Array Element:");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        finder obj1=new finder();
        obj1.find(arr);
        }
    }
