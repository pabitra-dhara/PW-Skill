import java.util.Scanner;
public class swapTwoNumberUseTwoVeriable {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int x= scn.nextInt();
        System.out.print("Enter 2nd Number:");
        int y=scn.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.print(x+" "+y);
    }
}
