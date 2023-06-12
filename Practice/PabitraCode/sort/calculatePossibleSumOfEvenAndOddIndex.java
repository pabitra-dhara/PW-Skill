import java.util.Scanner;

public class calculatePossibleSumOfEvenAndOddIndex {
    static void operation(int arr[]){
        int evenSum=0;
        int oddSum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                evenSum=evenSum*10+arr[i];
            }else{
                oddSum=oddSum*10+arr[i];
            }
        }
        int ans=evenSum+oddSum;
        System.out.print("Sum of Odd & Even index Number:"+ans);
    }
    // static void sSort(int arr[],int size){
    //     int i;
    //     for(i=0;i<size-1;i++){
    //         int min_index=i;
    //         for(int j=i+1;i<size;i++){
    //             if(arr[j]<arr[min_index]){
    //                 min_index=j;
    //             }
    //         }
    //         if(min_index!=i||min_index>=i){
    //             int temp=arr[i];
    //             arr[i]=arr[min_index];
    //             arr[min_index]=temp;
    //         }
    //     }
    // }    
    static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array Element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //sSort(arr,size);
        bubbleSort(arr);
        operation(arr);
        
    }
}
