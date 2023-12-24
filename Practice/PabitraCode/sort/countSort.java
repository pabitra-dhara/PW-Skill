import java.util.Scanner;

public class countSort {
    static int maxfind(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int val:arr){
            if(val>max){
                max=val;
            }
        }
        return max;
    }
    static void basicCountSort(int arr[]){
        int max=maxfind(arr);
        int []count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }
    static void display(int arr[]){
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=0;
        System.out.println("Enter Array Size:");
        size=sc.nextInt();
        System.out.println("Enter Array Element:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        basicCountSort(arr);
        display(arr);
    }
}
