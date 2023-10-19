import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String str="953+4*6/-";
        Stack<String> val=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                String val2=val.pop();
                String val1=val.pop();
                val.push(ch+val1+val2);
            }else{
                String s=String.valueOf(ch);
                val.push(s);
            }
        }
        System.out.print(val.peek());
    }
}