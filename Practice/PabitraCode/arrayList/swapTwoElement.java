import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class swapTwoElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int s=sc.nextInt();       
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("Enter Array Element:");
        for(int i=0;i<s;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Enter Swap 1st Index Number:");
        int x=sc.nextInt();
        System.out.println("Enter 2nd Index Number:");
        int y=sc.nextInt();
        Collections.swap(list, x, y);
        for(int i=0;i<s;i++){
           System.out.print(list.get(i)+" "); 
        }
    }
}
