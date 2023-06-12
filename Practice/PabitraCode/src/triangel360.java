import java.util.Scanner;
public class triangel360 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();

        // for(int i=0;i<row;i++){
        //     for(int j=0;j<row-i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row+1-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
