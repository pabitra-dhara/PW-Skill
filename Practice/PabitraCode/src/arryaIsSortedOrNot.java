import java.util.Scanner;
    class arrayChacker{
       boolean chack(int arr[]){
           boolean ans=true;
            for(int i=1;i<arr.length;i++){
                if(arr[i]<arr[i-1]){
                    ans=false;
                }
            }
            return ans;
        }
    }

public class arryaIsSortedOrNot {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=scn.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array Element:");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        arrayChacker obj=new arrayChacker();
        System.out.print(obj.chack(arr));
    }
}
