import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sortIntegerArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int s=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("Enter Array Element:");
        for(int i=0;i<s;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        for(int i=0;i<s;i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
