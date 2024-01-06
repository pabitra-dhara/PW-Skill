public class findtargetElementInRotateArr {
    static int findTaget(int a[],int k){
        int st=0;
        int end=a.length-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(a[mid]==k){
                return mid;
            }else if(a[mid]<=k){
                ans=mid;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={3,3,4,5,1,2};
        int target=1;
        System.out.println(findTaget(arr,target));
    }
}
