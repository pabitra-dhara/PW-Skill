import java.util.Scanner;
public class raicetoPowerFind {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int pow=1;
        for(int i=1;i<=y;i++){
            pow=x*x;
        }
        System.out.println(pow);
    }
}
