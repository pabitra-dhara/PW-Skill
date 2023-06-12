import java.util.Scanner;

public class findFirstUpperCase {
    static String uppercase(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        if(Character.isUpperCase(s.charAt(idx))){
            return s.substring(idx,s.length());
        }
        return uppercase(s, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Write A String Value:");
        String s=sc.nextLine();
        System.out.print(uppercase(s, 0));
    }
}
