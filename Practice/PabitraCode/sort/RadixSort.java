import java.util.Scanner;

public class RadixSort {
    private static int maxfind(int nums[]){
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    public static void CountSort(int arr[],int place){
        int max=maxfind(arr);
        int count[]=new int[10];
        for(int val:arr){
            count[(val/place)%10]++;
        }
        for(int j=1;j<count.length;j++){
            count[j]+=count[j-1];
        }
        int output[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        int k=0;
        for(int val:output){
            arr[k++]=val;
        }
    }
    public static void radixsort(int arr[]){
         int max=maxfind(arr);
         //apply counting sort to sort elements based on place value
         for(int place=1;max/place>0;place*=10){
             CountSort(arr,place);
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
        System.out.print("Enter Size:");
        int size=sc.nextInt();
        System.out.println("Enter Element:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        radixsort(arr);
        display(arr);
    }
}
