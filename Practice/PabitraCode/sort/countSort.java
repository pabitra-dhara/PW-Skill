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
    static void countSortMain(int arr[]){
        int max=maxfind(arr);
        int n=arr.length;
        int output[]=new int[n];
        //prefix sum find use to this arr
        int count[]=new int[max+1];
        //1 st creat a frequency arraya value
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //2nd find prefix sum 
        for(int i=1;i<count.length;i++){
            count[i]=count[i]+count[i-1];
        }
        
        //find the index of each element in the original array out it in output arraya
        for(int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }

        //copy in original arr
        for(int i=0;i<arr.length;i++){
            arr[i]=output[i];
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
        //basicCountSort(arr);
        //display(arr);
        countSortMain(arr);
        display(arr);
    }
}
