package lectare44Qusten;

public class Sort012Q3 {
    public static void main(String[] args) {
        int arr[]={0,1,2,2,0,0};
        int count_0=0;
        int count_1=0;
        int count_2=0;
        for(int val=0;val<arr.length;val++){
            if(arr[val]==0) count_0++;
            else if(arr[val]==1) count_1++;
            else if(arr[val]==2) count_2++;
        }
        int k=0;
        while(count_0!=0){
            arr[k++]=0;
            count_0--;
        }
        while(count_1!=0){
            arr[k++]=1;
            count_1--;
        }
        while(count_2!=0){
            arr[k++]=2;
            count_2--;
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
