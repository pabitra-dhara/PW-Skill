public class findTargetInDuplicateArray {
    static int search_(int a[],int k){
        int st=0;
        int end=a.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(k==a[mid]){
               return mid; 
            }else if(a[st]==a[mid] && a[end]==a[mid]){
                st++;
                end--;
            }else if(a[mid]<=a[end]){//mid to end arraya is sorted
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
        int arr[]={1,1,1,1,2,3,1,1};
        System.out.println(search_(arr, 1));
        
    }
}
