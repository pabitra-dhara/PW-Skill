import java.util.Scanner;
//Que-:Given an array ‘a’ consisting of integers. Return the first value that is repeating in this array. If no value is being repeated, return -1.
class repetativeFind{
    static int finder(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   return arr[i];
               } 
            }
        }
        return -1;
    }
}

public class fastRepetativeNumberFind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        System.out.print("Enter Array Element:");
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("1st Repetative number is :"+repetativeFind.finder(arr));
    }
}
