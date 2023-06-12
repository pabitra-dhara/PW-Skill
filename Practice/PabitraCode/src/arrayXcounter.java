import java.util.Scanner;
//Qne-: Given an array of size n, find the total number of occurrences of given number x.
class Xcounter{
    void  count(int arr[],int x){
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                flag++;
            }
        }
        System.out.println(flag);
    }
}
public class arrayXcounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        System.out.println("Enter Arraya Element:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter Your Counter Number:");
        int x=sc.nextInt();

        Xcounter obj=new Xcounter();
        obj.count(arr, x);
    }
}
