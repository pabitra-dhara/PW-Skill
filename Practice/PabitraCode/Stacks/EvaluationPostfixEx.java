import java.util.Scanner;
import java.util.Stack;

public class EvaluationPostfixEx {
    public static void main(String[] args) {
        String str="953+4*6/-";
        Stack<Integer> val=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                int val2=val.pop();
                int val1=val.pop();
                if(ch=='+') val.push(val1+val2);
                if(ch=='-') val.push(val1-val2);
                if(ch=='*') val.push(val1*val2);
                if(ch=='/') val.push(val1/val2);
            }else{
                val.push((int)ch-48);
            }
        }
        System.out.println("Ans:"+val.peek());
    }
}
