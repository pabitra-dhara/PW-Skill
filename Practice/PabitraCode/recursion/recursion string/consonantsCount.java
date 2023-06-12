import java.util.Scanner;

public class consonantsCount {
    static String conCount(String s,int idx,int count){
        if(idx==s.length()){
            return "";
        }
        
        if(s.substring(idx)==('a' && 'e' && 'i' && 'o' && 'u')){
         return conCount(s, idx+1,count);   
        }
        count+=1;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A String:");
        String s=sc.nextLine();
        System.out.println(conCount(s, 0,0));
    }
}
