import java.util.Scanner;

public class sortEvenAndOdd {
    static void swapInArray(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    static void evenOddSort(int arr[]){
        int left=0;
        int right=arr.length-1;

        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swapInArray(arr, left, right);
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        System.out.println("Enter Arrays Element:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        
        evenOddSort(arr);
        System.out.println("Arraay Sorted Form Is:");
        printArray(arr);

    }
}
