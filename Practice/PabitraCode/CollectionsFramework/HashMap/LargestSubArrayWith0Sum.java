import java.util.HashMap;
import java.util.Scanner;

public class LargestSubArrayWith0Sum {
	public static int zeroSum(int arr[],int n) {
		HashMap<Integer,Integer> mp=new HashMap<>();
		int maxLength=0;
		int prefSum=0;
		mp.put(0, -1);
		for(int i=0;i<n;i++) {
			prefSum+=arr[i];
			if(mp.containsKey(prefSum)) {
				maxLength=Math.max(maxLength, i-mp.get(prefSum));
			}else {
				mp.put(prefSum, i);
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.print("Enter Array Size:");
		int size=sc.nextInt();
		System.out.println("Enter Array Element:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Ans:"+zeroSum(arr, size));
	}

}
