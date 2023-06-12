import java.util.Scanner;
public class sortStringUsingBubbleSort {
    static void StringSort(String arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp=arr[j];
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
        String arr[]=new String[size];
        System.out.println("Enter arraya element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.next();
        }
        StringSort(arr, size);
        for(String val:arr){
            System.out.print(val+ " ");
        }
    }
}
