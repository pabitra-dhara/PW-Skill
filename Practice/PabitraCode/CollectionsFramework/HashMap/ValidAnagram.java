import java.util.*;
class ValidAnagram {
	public static HashMap<Character,Integer> freqMap(String s){
		HashMap<Character,Integer> freq=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!freq.containsKey(ch)) {
				freq.put(ch,1);
			}else {
				int currFre=freq.get(ch);
				freq.put(ch,currFre+1);
			}
		}
		return freq;
	}
	public static boolean anagram(String s,String p) {
		if(s.length()!=p.length()) return false;
		HashMap<Character,Integer> mp1=freqMap(s);
		HashMap<Character,Integer> mp2=freqMap(p);
		return mp1.equals(mp2);
	}
	public static boolean anagram2(String s,String p) {
		if(s.length()!=p.length()) return false;
		HashMap<Character, Integer> mp1=freqMap(s);
		for(int i=0;i<p.length();i++) {
			char ch=p.charAt(i);
			if(!mp1.containsKey(ch)) return false;
			int currfreq=mp1.get(ch);
			mp1.put(ch, currfreq-1);
			if(mp1.get(ch)==0) mp1.remove(ch);
		}
//		for(int i:mp1.values()) {
//			if(i!=0) return false;
//		}
		if(mp1.isEmpty()) return true;
		return false;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Write Two String:");
	String s=sc.nextLine();
	String p=sc.nextLine();
	System.out.println(anagram(s, p));
	System.out.println(anagram2(s, p));
	}
}
