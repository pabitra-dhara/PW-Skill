import java.util.Scanner;
public class stringReverseUsingStringBuilder
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter String Value:");
	    String arr=sc.nextLine();
	    StringBuilder sb=new StringBuilder(arr);
	    for(int i=0;i<sb.length()/2;i++){
	        int front=i;
	        int back=sb.length()-1-i;
	        char frontChar=sb.charAt(front);
	        char backchar=sb.charAt(back);
	        sb.setCharAt(front,backchar);
	        sb.setCharAt(back,frontChar);
	    }
	    System.out.print(sb);
	}
}
