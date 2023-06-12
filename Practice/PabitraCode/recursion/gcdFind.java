import java.util.Scanner;


public class gcdFind {
    //subtraction process
    static int gcd1(int x,int y){
        if(y==0 || x==0){
            return 0;
        }
        if(x==y){
            return x;
        }
        if(x>y){
            return gcd1(x-y, y);
        }
        return gcd(x, y-x);
    }
    //division process
    static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entre 1st Number:");
        int x=sc.nextInt();
        System.out.print("Enter 2nd Number:");
        int y=sc.nextInt();
        System.out.print("Answer is :"+gcd(x, y));
        System.out.print("Answer is:"+gcd1(x, y));
    }
}
