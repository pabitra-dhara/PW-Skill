public class stringbuilder
{
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Tony");
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		sb.setCharAt(0,'p');
		System.out.println(sb);
		sb.insert(2,'r');
		System.out.println(sb);
		sb.delete(4,5);
		System.out.println(sb);
		sb.append("hub");
		System.out.println(sb);
	}
}
