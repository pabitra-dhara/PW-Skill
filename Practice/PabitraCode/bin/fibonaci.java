/**
 * fibonaci
 */
public class fibonaci {
    public static int fib(int n) {
        if(n<2) return n;
        int n1=0;
        int n2=1;
        int fibo=0;
        for(int i=2;i<=n;i++){
            fibo=n1+n2;
            System.out.print(fibo+" ");
            n1=n2;
            n2=fibo;
        }
        System.out.println();
        return fibo;
    }

    public static void main(String[] args) {
        //n=3 
        //out 0 1 1 =2
        //n=8
        //out 0 1 1 2 3 5 8 13 21 
        System.out.println(fib(8));
    }
}