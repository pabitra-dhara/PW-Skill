import java.util.Scanner;

public class countSmallCase {
    static int count(String str,int idx){
        if(idx == str.length()-1){
            if(str.charAt(idx) >= 97 && str.charAt(idx) <= 122){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(str.charAt(idx) >= 97 && str.charAt(idx) <= 122){
            return count(str, idx+1) + 1;
        }
        else{
            return count(str, idx+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Write A String:");
        String s=sc.nextLine();
        System.out.print(count(s, 0));
    }
}
