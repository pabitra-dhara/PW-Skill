import java.util.Scanner;
//reverse array with out create new array
public class reverseArrayWithOutNewArray {
    // static void swapInArray(int arr[],int i,int j){
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
        
    // }


    static void reversArray(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            //swapInArray(arr, i, j);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

        //this mathod print array
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
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
        reversArray(arr);
        printArray(arr);
    }
}
