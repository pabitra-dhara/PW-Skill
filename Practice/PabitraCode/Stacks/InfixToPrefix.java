import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String infix="9-(5+3)*4/6";
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                String s=""+ch;
                val.push(s);
            }else if(op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch);
            }else if(ch==')'){
                while(op.peek()!='('){
                  String v2=val.pop();
                  String v1=val.pop();
                  char o=op.pop(); 
                  String t=o+v1+v2;
                  val.push(t); 
                }
                op.pop();//pop (
            }else{
                if(ch=='+' || ch=='-'){
                String v2=val.pop();
                  String v1=val.pop();
                  char o=op.pop(); 
                  String t=o+v1+v2;
                  val.push(t);
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                  String v2=val.pop();
                  String v1=val.pop();
                  char o=op.pop(); 
                  String t=o+v1+v2;
                  val.push(t);
                        op.push(ch);
                    }else{
                        op.push(ch);
                    }
                }
            }
        }
        while(val.size()>1){
            String v2=val.pop();
                  String v1=val.pop();
                  char o=op.pop(); 
                  String t=o+v1+v2;
                  val.push(t);
        }
        System.out.println(val.peek());
        
    }
}
