import java.util.HashMap;
import java.util.Map;

public class CheckExistingPair {

	public static boolean xValueCheck(int arr[],int x) {
		Map<Integer,Integer> hm=new HashMap<>();
		int a=0;
		int ans=0;
		for(var e:arr) {
			ans=a+e;
			a=e;
			hm.put(e,ans);
			ans=0;
		}
		for(var e:hm.entrySet()) {
			if(e.getValue()==x) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[]={0,-1,2,-3,1};
        int x=-2;
        System.out.println(xValueCheck(arr, x));
	}

}
