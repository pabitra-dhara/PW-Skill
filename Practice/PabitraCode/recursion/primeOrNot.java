import java.util.Scanner;

public class primeOrNot {
    public static boolean isPrime(int n,int i){
        if(n<=2){
            return (n==2)?true:false;
        }
        if(n%i==0){
            return false;
        }
        if(i*i>n){
            return true;
        }
        return isPrime(n, i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number:");
        int num=sc.nextInt();
        if(isPrime(num,2)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
