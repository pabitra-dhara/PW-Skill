import java.util.Scanner;

public class sumFind {
    static int find(int arr[],int i){
        if(i==arr.length){
            return 0;
        }
        int sum=find(arr, i+1);
        return sum+arr[i];
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
        System.out.println(find(arr, 0));
    }
}
