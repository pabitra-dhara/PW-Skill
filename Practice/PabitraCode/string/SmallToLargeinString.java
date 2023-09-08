import java.util.Scanner;

public class SmallToLargeinString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any String Value:");
        String input=sc.nextLine();
        StringBuilder str=new StringBuilder(input);
        for(int i=0;i<str.length();i++){
            boolean flag=true;
            char ch=str.charAt(i);
            if(ch==' '){
                continue;
            }
            int asci=(int)ch;
            if(asci>=97){
                flag=false;
            }
            if(flag==true){
                asci+=32;
                char dh=(char)asci;
                str.setCharAt(i, dh);
            }else{
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str);
    }
}
