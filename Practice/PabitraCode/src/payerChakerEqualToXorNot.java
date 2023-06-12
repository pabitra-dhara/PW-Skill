import java.util.Scanner;
//Que-:Given an array sorted in increasing order of size n and an integer x, find if there exists a  pair in the array whose absolute difference is exactly x.(n>1) 
public class payerChakerEqualToXorNot {
    public static void chacker(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]==x){
                 System.out.print("Yes!");  
                 return; 
                }
            }
        }
        System.out.print("No!");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        System.out.println("Enter Array Element:");
        int arr[]=new int[size];
        for(int val:arr){
            arr[val]=sc.nextInt();
        }

        System.out.print("Enter Chacking Number:");
        int x=sc.nextInt();

        chacker(arr, x);
    }
}
