
public class targetEndAndStartFind {
    public static int[] targetQe(int[] nums,int target){
    int arr[]=new int[2];
    arr[0]=-1;
    arr[1]=-1;
    int st=0;
    int end=nums.length-1;
    while(nums[st]!=nums[end]){
        if(nums[st]!=target){
            st++;
        }else if(nums[end]!=target){
            end--;
        }
    }
    arr[0]=st;
    arr[1]=end;
    return arr;
    }
    public static void main(String[] args) {
        int number[]={1};
	    int t=1;
        int ans[]=targetQe(number, t);
        for(int val:ans){
            System.out.print(val+" ");
        }
    }
}

