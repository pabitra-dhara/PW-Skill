import java.util.Scanner;

public class palindromFind {
    static String reveString(String s,int idx){
        if(idx==s.length())
            return "";
        
        String smallAns=reveString(s, idx+1);
        return smallAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any String Value:");
        String s=sc.nextLine();
        String ans=reveString(s, 0);
        if(s.equals(ans)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

    }
}