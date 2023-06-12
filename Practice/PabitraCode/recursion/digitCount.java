import java.util.Scanner;

public class digitCount {
    static int counter(int num){
        if(num>=0 && num<=9){
            return 1;
        }
       return counter(num/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Numner:");
        int num=sc.nextInt();
        System.out.print("Number of Digit:"+counter(num));
    }
}
