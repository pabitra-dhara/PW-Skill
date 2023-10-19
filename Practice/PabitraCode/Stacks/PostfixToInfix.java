import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String str="953+4*6/-";
        Stack<String> val=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                String val2=val.pop();
                String val1=val.pop();
                val.push(val1+ch+val2);
            }else{
                String s=String.valueOf(ch);
                val.push(s);
            }
        }
        System.out.println(val.peek());
    }
}
