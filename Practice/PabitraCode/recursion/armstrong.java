import java.util.Scanner;

public class armstrong {
    static int counter(int num){
        if(num>=0 && num<=9){
            return 1;
        }
       return counter(num/10)+1;
    }
    static void arm(int x){
        int temp=x;
        int y=x;
        int length=counter(x);
        int sum=0;
        
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, length);
            temp /= 10;
        }
        if(sum==y){
            System.out.println("Yes");
        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number:");
        int x=sc.nextInt();
        arm(x);
    }
}
