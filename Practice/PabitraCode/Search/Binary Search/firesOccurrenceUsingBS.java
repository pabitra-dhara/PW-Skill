public class firesOccurrenceUsingBS {
    static int Occurence(int a[],int k){
        int fo=-1;
        int start=0;
        int end=a.length;
        while(start<end){
            int mid=start+(end-start)/2;
            if(a[mid]==k){
                fo=mid;
                end=mid-1;
            }else if(k>a[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int arr[]={2,5,5,5,5,6,6,8};
        int k=5;
        System.out.println(Occurence(arr, k));
    }
}
