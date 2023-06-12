import java.util.ArrayList;
import java.util.Scanner;

public class printArrayPositivNumber {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int s=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("Enter Array Element:");
        int arr[]=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++){
            if(arr[i]>=0){
                list.add(arr[i]);
            }
        }
        if(list.size()==0){
            System.out.print("NA");
        }
        for(int i=0;i<s;i++){
            System.out.print(list.get(i));
        }
   }
}
