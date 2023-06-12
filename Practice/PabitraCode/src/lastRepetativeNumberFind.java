import java.util.Scanner;
//Que-:Given an array ‘a’ consisting of integers. Return the last value that is repeating in this array. If no value is being repeated, return -1.
public class lastRepetativeNumberFind {

    static int finder(int arr[]){
        for(int i=arr.length-1;i>0;i--){
            for(int j=i-1;j>0;j--){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entre Arrya Size:");
        int size=sc.nextInt();

        System.out.println("Enter Array Size:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println(finder(arr));
    }
}
