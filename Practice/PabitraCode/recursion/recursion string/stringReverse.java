import java.util.Scanner;

public class stringReverse {
    static String revers2(String s){
      if(s.length()==0){
        return "";
      }
      String smallAns=revers2(s.substring(1));
      char fast=s.charAt(0);
      return smallAns+fast;
    }
    static String reverse(String s,int idx){
    if(idx==s.length())
    return "";

    String smallAns=reverse(s, idx+1);
    return smallAns+s.charAt(idx);
    }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Any String:");
      String s=sc.nextLine();
      System.out.println(reverse(s, 0));
      System.out.println(revers2(s));
  }  
}
