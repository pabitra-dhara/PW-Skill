import java.util.Scanner;

public class insertionSortUseRecursion {
    static void insertionSort(int arr[]){
        
        if(arr.length==arr.length+1){
            return;
        }
        int ans=insertionSort(arr[]);
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
    }
}
