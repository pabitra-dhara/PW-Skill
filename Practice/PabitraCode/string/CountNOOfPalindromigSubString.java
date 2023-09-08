import java.util.Scanner;

public class CountNOOfPalindromigSubString {
    public static boolean palindrem(String ch){
        int i=0;
        int j=ch.length();
        while(i<j){
            if(ch.charAt(i)!=ch.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any String Value:");
        String st=sc.nextLine();
        int count=0;
        for(int i=0;i<st.length();i++){
            for(int j=i+1;j<=st.length();j++){
                if(palindrem(st.substring(i,j))==true){
                    System.out.print(st.substring(i,j));
                    count++;
                }    
            }
        }
        System.out.print("Total palindram number:"+count);
    }
}
