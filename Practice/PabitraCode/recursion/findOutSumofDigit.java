import java.util.Scanner;
public class findOutSumofDigit {
    static int sum(int num){
        if(num>=0 && num<=9){
            return num;
        }
        return sum(num/10)+(num%10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number:");
        int num=sc.nextInt();
        System.out.print("Sum:"+sum(num));
    }
}
