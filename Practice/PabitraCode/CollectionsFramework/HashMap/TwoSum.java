import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
	public static int[] find(int arr[],int target) {
		int ans[]={-1};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					ans=new int[]{i,j};
					return ans;
				}
			}
		}
		return ans;
	}

	
	public static int[] findUsingHashMap(int arr[],int target) {
		int ans[]= {-1};
		HashMap<Integer,Integer> mp=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int partner=target-arr[i];
			if(mp.containsKey(partner)) {
				ans=new int[] {mp.get(partner),i};
				return ans;
			}
			mp.put(arr[i],i);
		}
		return ans; 
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Arraya Size:");
		int size=sc.nextInt();
		System.out.println("Enter Array Element:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter Target Element:");
		int target=sc.nextInt();
		int ans[]=find(arr,target);
		for(int val:ans) {
			System.out.print(val+" ");
		}
		int ans2[]=findUsingHashMap(arr, target);
		for(int val:ans2) {
			System.out.print(val+" ");
		}
	}

}
