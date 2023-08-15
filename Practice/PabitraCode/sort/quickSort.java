import java.util.Scanner;

public class quickSort {
     
    static void swap(int arr[],int st,int end){
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
    }

    static int partition(int arr[],int st,int end){
        int pivot=arr[st];
        int count=0;
        for(int i=st+1;i<end;i++){
        if(arr[i]<=pivot){
            count++;
        }
    }
        int pivotIndx=st+end;
        swap(arr,st,pivotIndx);
        int i=st,j=end;
        while(i<pivotIndx && j>pivotIndx){
            while(arr[i]<pivotIndx){
                i++;
            }
            while(arr[j]<pivotIndx){
                j--;
            }
            if(i<pivotIndx && j>pivotIndx){
                swap(arr, i, j);
                i++;
                j--;
            }

        }
        return pivotIndx;

    }

    static void QuickSort(int arr[],int st,int end){
        if(st>=end){
            return;
        }
        int pi=partition(arr,st,end);
        QuickSort(arr, st, pi-1);
        QuickSort(arr, pi+1, end);
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
        QuickSort(arr, 0, size);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
