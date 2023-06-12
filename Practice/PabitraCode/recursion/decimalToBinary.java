import java.util.Scanner;

public class decimalToBinary {
    static int con(int dec){
        if(dec==1){
            System.out.print(dec);
            return 1;
        }
        return con(dec/2);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Decimal Number:");
        int dec=sc.nextInt();
        System.out.println(con(dec));
    }
}
