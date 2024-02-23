import java.util.Scanner;

public class DistebuteChocolet {
    public static boolean isDivisonPossible(int arr[],int maxStudent,int maxchoclet){
        int numsOfStudent=1;
        int cho=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxchoclet) return false;
            if(cho+arr[i]<=maxchoclet){
                cho+=arr[i];
            }else{
                numsOfStudent++;
                cho=arr[i];
            }
        }
        return numsOfStudent<=maxStudent;
    }

    public static int distebuteChocolet(int arr[],int m){
        if(arr.length<m) return -1;
        int ans=0;
        int st=1;
        int end=(int)1e9;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isDivisonPossible(arr,m,mid)){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length Of Arrays:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array Element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Student Number:");
        int m=sc.nextInt();
        System.out.println(distebuteChocolet(arr, m));
    }
}