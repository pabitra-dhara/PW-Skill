import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
    int dec=sc.nextInt();
    int ans=0,pow=1;

    while(dec>0){
        int l=dec%2;
        ans=ans+(l*pow);
        pow=pow*10;
        dec/=2;
    }
    System.out.println(ans);   
    }
}
