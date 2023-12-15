import java.util.HashMap;
import java.util.Map;

public class KMultiplyPairFoind {

	public static void main(String[] args) {
		int arr[]={9,7,5,3};
		int k=6;
		 
		Map<Integer,Integer> hm=new HashMap<>();
		
		int l=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int sum=arr[i]+arr[j];
				hm.put(l++,sum);
			}
		}
		
		for(var e:hm.entrySet()) {
			if(e.getValue()==k*2) {
				System.out.println("True");
				return;
			}
		}
		System.out.println("False");
	}

}
