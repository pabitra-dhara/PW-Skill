import java.util.Scanner;

public class sumOfNNumberButAlternateSings {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        if(n%2==0){
            return sum(n-1)-n;
        }
        return sum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N Size:");
        int n=sc.nextInt();
        System.out.print(sum(n));
    }
}
