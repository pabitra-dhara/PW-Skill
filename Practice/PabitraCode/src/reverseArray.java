import java.util.Scanner;
//reverse array with create new array
public class reverseArray {

    static int[] revers(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
        }
        return ans;
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
        int print[]=revers(arr);
        for(int i=0;i<size;i++){
            System.out.print(print[i]);
        }
    }
}
