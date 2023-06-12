import java.util.Scanner;
//qus-:prefix sum find 
public class prefixSumFind {
    //create a new arrays
    // static int[] sumCalculate(int arr[]){
    //     int prefix[]=new int[arr.length];
    //     prefix[0]=arr[0];
    //     for(int i=1;i<arr.length;i++){
    //         prefix[i]=arr[i]+prefix[i-1];
    //     }
    //     return prefix;
    // }


    //without create a new array

    static int sumCalculate(int arr[])[]{
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    
    static void arrayPrint(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Length:");
        int size=sc.nextInt();

        System.out.println("Enter Arrays Element:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int prefix[]=sumCalculate(arr);
        arrayPrint(prefix);
    }
}
