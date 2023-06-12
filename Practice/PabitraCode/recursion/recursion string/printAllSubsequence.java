import java.util.ArrayList;
import java.util.Scanner;
public class printAllSubsequence {
    static ArrayList<String>getSSQ(String s){
        ArrayList<String>ans =new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curr=s.charAt(0);
        ArrayList<String>smallAns=getSSQ(s.substring(1));
        for(String ss:smallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter String Value:");
        String s=sc.nextLine();
        ArrayList<String>ans=getSSQ(s);
        for(String ss:ans){
            System.out.print(ss+" ");
        }
    }
}