import java.util.Scanner;

import java.util.Stack;

public class BalanceBracket {

    static boolean bracketChack(String str){
        Stack<Character> st=new Stack<>();
        int s=str.length();
        for(int i=0;i<s;i++){
            char c=str.charAt(i);
            if(c=='('){
                st.push(c);
            }else{
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='('){
                     st.pop();
                }
            }
        }
        if(st.size()>0) return false;
            return true;
    }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
        System.out.println(bracketChack(str));
   } 
}
