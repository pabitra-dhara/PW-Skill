import java.util.Scanner;
class Array{
    int counter(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        System.out.println("Enter Array Element:");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Count Number:");
        int x=sc.nextInt();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans++;
            }
        }
        return ans;
    }
}




public class numberCounterUseArray {
    public static void main(String[] args) {
        Array obj1=new Array();
        System.out.println(obj1.counter());
    }
}
