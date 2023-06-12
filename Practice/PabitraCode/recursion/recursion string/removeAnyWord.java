import java.util.Scanner;

public class removeAnyWord {
    static String remove1(String s){
        if(s.length()==0){
            return "";
        }
        String smallAns=remove1(s.substring(1));
        char fast=s.charAt(0);
        if(fast!='a'){
            return smallAns+fast;
        }else{
            return smallAns;
        }
    }
    static  String remove(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        String smallAns=remove(s, idx+1);
        char fast=s.charAt(idx);
        if(fast!='a'){
            return smallAns+fast;
        }else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any String Value:");
        String s=sc.nextLine();
        System.out.println(remove(s,0));
        System.out.print(remove1(s));
    }  
}