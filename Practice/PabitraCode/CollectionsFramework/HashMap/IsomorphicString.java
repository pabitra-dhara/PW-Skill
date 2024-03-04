import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicString {
	public static boolean isomorphic(String s,String t) {
		HashMap<Character,Character> mp=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char sch=s.charAt(i);
			char tch=t.charAt(i);
			if(mp.containsKey(sch)) {
				if(mp.get(sch)!=tch) return false;
			}else if(mp.containsValue(tch)) {
				return false;
			}else {
				mp.put(sch, tch);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		System.out.print(isomorphic(s,t));
	}

}
