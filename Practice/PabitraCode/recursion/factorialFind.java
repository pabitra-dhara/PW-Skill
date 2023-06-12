import java.util.Scanner;

public class factorialFind {
    static int fac(int n){
        if(n==1){ 
            return n;
        }
       return n*fac(n-1); 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Find Factorial Number:");
        int n=sc.nextInt();
        System.out.print(fac(n));
    }
}
