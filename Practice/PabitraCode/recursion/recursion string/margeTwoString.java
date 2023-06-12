import java.util.Scanner;

public class margeTwoString {
    static String marge(String s1,String s2){
        String ans="";
        if(s1.length()==0){
            ans+=s2;
            return ans;
        }
        if(s2.length()==0){
            ans+=s1;
            return ans;
        }
        ans+=s1.substring(0, 1);
        ans+=s2.substring(0, 1);
        ans+=marge(s1.substring(1,s1.length()), s2.substring(1,s2.length()));
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1=sc.nextLine();
        System.out.print("Enter 2nd String:");
        String s2=sc.nextLine();
        System.out.println(marge(s1, s2));
    }
}
