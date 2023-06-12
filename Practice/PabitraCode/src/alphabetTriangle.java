// import java.util.Scanner;
// public class alphabetTriangle {
//  public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);

//      int x=sc.nextInt();

//      for(int i=65;i<x+65;i++){
//          for(int k=x+65;k>65;k--){
//              System.out.println(" ");
//          }
//          for(int j=65;j<i;j++){
//              System.out.print((char)(j));
//          }
//          System.out.println();
//      }
//  }   
// }
import java.util.Scanner;
/**
 * alphabetTriangle
 */
public class alphabetTriangle {

    public static void main(String[] args) {
        int size=4;
        int alph=65;
        int num=0;
        for (int i=1;i<=size;i++){
            for (int j=size;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=0;k<=i*2-1;k++){
                System.out.print((char)(alph+num++));
            }
            System.out.println();
        }
    }
}
