import java.util.Scanner;

public class subStringFind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any String Value:");
        String st=sc.nextLine();
        StringBuilder str=new StringBuilder(st);
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
