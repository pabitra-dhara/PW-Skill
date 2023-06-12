import java.util.ArrayList;
import java.util.Scanner;

public class createNsizeArrayInputUserDefine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr Array Size:");
        int n=sc.nextInt();
        ArrayList<Integer>ls=new ArrayList<>();
        System.out.println("Enter Array Element:.");
        for(int i=0;i<n;i++){
            ls.add(sc.nextInt());
        }
        System.out.println("Enter Insert Element:");
        int x=sc.nextInt();
        ls.add(0,x);
        for(int k=0;k<ls.size();k++){
            System.out.print(ls.get(k)+" ");
        }
    }
}
