import java.util.Scanner;
public class fibonacySerice {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a=1,b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
}
