import java.util.Scanner;
public class displayHalfOfElementinArraya {
    static void arrayaChecker(int arr[],int size){
        if(size%2!=0){
            System.out.println("Output:");
            for(int i=size/2;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }else{
        System.out.println("Output:");
        for(int i=size/2;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        }
    }
    static void selectionSort(int arr[]){
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
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        System.out.println("Enter Array Element:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);
        arrayaChecker(arr, size);
    }
}
