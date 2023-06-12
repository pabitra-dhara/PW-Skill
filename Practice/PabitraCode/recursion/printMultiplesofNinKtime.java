import java.util.Scanner;

public class printMultiplesofNinKtime {
    static void mul(int num,int k){
        if(k==0){
            return;
        }
        mul(num, k-1);

        System.out.print(num*k+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number:");
        int num=sc.nextInt();
        System.out.print("Enter K Value:");
        int k=sc.nextInt();
        mul(num, k);
    }
}
