import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String str="-9/*+5346";
        Stack<String> val=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                String val1=val.pop();
                String val2=val.pop();
                val.push(val1+val2+ch);
            }else{
                String s=String.valueOf(ch);
                val.push(s);
            }
        }
        System.out.println("Ans"+val.peek());
    }
}
