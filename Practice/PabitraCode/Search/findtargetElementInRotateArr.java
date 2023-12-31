public class findtargetElementInRotateArr {
    static int findTaget(int a[],int k){
        int n=a.length;
        int st=0;
        int end=a.length-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(a[mid]<=a[n-1] && a[mid]<=k){
                ans=mid;
                end=mid-1;
            }else if(a[mid]>a[n-1]){
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        int target=3;
        System.out.println(findTaget(arr,target));
    }
}
