import java.util.ArrayList;
import java.util.Scanner;

public class removeArrayElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("Enter Array Element:");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Enter Array List Remove Index Number:");
        int ind=sc.nextInt();
        list.remove(ind);
        for(int k=0;k<list.size();k++){
            System.out.print(list.get(k)+" ");
        }
    }
}
