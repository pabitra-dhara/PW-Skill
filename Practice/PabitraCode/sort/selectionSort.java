import java.util.Scanner;

public class selectionSort {
    static void sortArr(int arr[],int size){
        int i;
        for(i=0;i<size-1;i++){
            int min_index=i;
            int j;
            for(j=i+1;j<size;j++){
                if(arr[j]<arr[min_index]){
                min_index=j;
            }
        } 
        if(min_index !=i ||min_index>=i){
        int temp=arr[i];
        arr[i]=arr[min_index];
        arr[min_index]=temp;
        }
    }
    }


    static void sortArray(int arr[],int size){
        int i;
        for(i=0;i<size-1;i++){
            int min_index=i;
            int j;
            for(j=i+1;j<size;j++)
                if(arr[j]<arr[min_index])
                min_index=j;
        
        int temp=arr[i];
        arr[i]=arr[min_index];
        arr[min_index]=temp;

    }
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
        //sortArr(arr, arr.length);

        sortArray(arr, size);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
