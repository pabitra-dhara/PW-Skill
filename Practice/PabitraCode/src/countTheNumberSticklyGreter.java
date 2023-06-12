import java.util.Scanner;
import java.io.*;

    class greterChacker{
        int gret(int arr[],int x){
            int count=0;

            for(int i=0;i<arr.length;i++){
                if(arr[i]>x){
                    count++;
                }
            }
            return count;
        }
    }

public class countTheNumberSticklyGreter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Element:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter X Number for chacke you can greter Number :");
        int x=sc.nextInt();

        greterChacker obj=new greterChacker();
        System.out.println(x+" greter number is :"+ obj.gret(arr, x));
    }
}
