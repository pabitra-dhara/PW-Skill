import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int row=sc.nextInt();
       for (int i=1;i<=row;i++){
           for(int j=1;j<=row-i;i++){
               System.out.print(" ");
           }
           for(int j=1;j<=2*i-1;j++){
               System.out.print("*");
           }
           System.out.println();
       } 
    }
}
