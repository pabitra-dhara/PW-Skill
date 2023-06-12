import java.util.Scanner;
public class printOneToNNumUsinWhile {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N Value:");
        int x=sc.nextInt();
        int num=1;
        while(num<=x){
            System.out.println(num);
            num++;
        }
    }
}