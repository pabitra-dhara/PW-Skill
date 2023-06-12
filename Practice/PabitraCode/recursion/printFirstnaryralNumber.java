import java.util.Scanner;
public class printFirstnaryralNumber {
    static void printIncrese(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        printIncrese(n-1);
        System.out.print(" "+n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N Value:");
        int n=sc.nextInt();
        printIncrese(n);
    }
}