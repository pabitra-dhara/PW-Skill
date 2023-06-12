import java.util.Scanner;
public class kthSmallestElementFind {
    static void finder(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(i+1==k){
                System.out.print("Kth Possion Number is:"+arr[i]);
            }
        }
    }
    static void arraySort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            if(min_index!=i||min_index>=i){
                int temp=arr[i];
                arr[i]=arr[min_index];
                arr[min_index]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Arraya Size:");
        int size=sc.nextInt();
        System.out.println("Enter Element in Array:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }


        arraySort(arr);
        // for(int val:arr){
        //     System.out.print(val+" ");
        // }
        System.out.print("Enter Your Searching Element:");
        int find=sc.nextInt();
        finder(arr, find);
    }
}
