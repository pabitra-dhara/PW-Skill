import java.util.Scanner;

public class printnaturalNumberReversForm {
    static void printDecrese(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        printDecrese(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N Size:");
        int n=sc.nextInt();
        printDecrese(n);
    }
}
