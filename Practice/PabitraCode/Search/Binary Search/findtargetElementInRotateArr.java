public class findtargetElementInRotateArr {
    static int findTarget(int a[],int k){
        int st=0;
        int end=a.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(k==a[mid]){
               return mid; 
            }else if(a[mid]<a[end]){//mid to end arraya is sorted
                if(k>a[mid] && k<=a[end]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }else{//st to mid array is sorted
                if(k>=a[st] && k<a[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,1,2,3};
        int target=3;
        System.out.println(findTarget(arr,target));
    }
}
