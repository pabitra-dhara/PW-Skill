import java.util.HashMap;
import java.util.Map;

public class FindMaxFrequenceofArray {

	public static void main(String[] args) {
		int arr[]={1,4,4,2,5,1,4,4,6,4,4,4};
		Map<Integer,Integer> freq=new HashMap<>();
		for(int val:arr) {
			if(!freq.containsKey(val)) {
				freq.put(val,1);
			}else {
				int m=freq.get(val); 
				freq.put(val,m+1);
			}
		}
		System.out.println("Freq Map:"+freq);
		int max=Integer.MIN_VALUE;
		int ans=0;
		for(var val:freq.entrySet()) {
			if(max<val.getValue()) {
				max=val.getValue();
				ans=val.getKey();
			}
		}
		System.out.println("Ans is: "+ans+" frequence is=> "+max);
	}
}
