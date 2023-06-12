import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraySortInDecendingOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list= new ArrayList<>();
        list.add(8);
        list.add(10);
        list.add(7);
        list.add(2);
        list.add(12);
        // System.out.println("Print Original Array:");
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("Asending Order:");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        System.out.println("Decending Order:");
        Collections.sort(list);
        System.out.println(list);
    }
}