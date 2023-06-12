import java.util.Scanner;
public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int biNum=sc.nextInt();
        int pow=1,ans=0;
        while(biNum>0){
            int l=biNum%10;//1111%10=1
            ans+=l*pow;//ans=0+1*1
            pow*=2;//1*2
            biNum/=10;//1111/10=111
        }
        System.out.println(ans);
    }
}
