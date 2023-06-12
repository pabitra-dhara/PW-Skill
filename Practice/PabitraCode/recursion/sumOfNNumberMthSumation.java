import java.util.Scanner;

public class sumOfNNumberMthSumation {
    static int sum(int n,int m){
        if(m==1){
        return (n * (n + 1) / 2);
        }
        int ans= sum(n, m-1);
        
        return (ans* (ans+1)/2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N Value:");
        int n=sc.nextInt();
        System.out.print("Enter m-th Number:");
        int m=sc.nextInt();
        System.out.print("Ans:"+sum(n, m));
    }
    
}