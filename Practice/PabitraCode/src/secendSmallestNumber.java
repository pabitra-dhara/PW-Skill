import java.util.Scanner;

//Que-: Find the second-smallest value in the given array
     class firstSmallestFinder{
      int finder(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
       }
    }

    class secendSmallest{
        int find(int arr[]){
            firstSmallestFinder obj=new firstSmallestFinder();
            int mn=obj.finder(arr);
            for(int i=0;i<arr.length;i++){
                if(arr[i]==mn){
                    arr[i]=Integer.MAX_VALUE;
                }
            }
            int ans=obj.finder(arr);
            
            return ans;
        }
    }

public class secendSmallestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();


        int arr[]=new int[size];
        System.out.println("Enter Array Element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        // firstSmallestFinder obj=new firstSmallestFinder();
        // System.out.println(obj.finder(arr));

        secendSmallest obj3=new secendSmallest();
        System.out.print("Secende Smallest Number Is :"+obj3.find(arr));
    }
}
