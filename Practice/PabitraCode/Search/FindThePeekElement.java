import java.util.Scanner;

public class FindThePeekElement {
    public static int SearchPeek(int a[]){
        int st=0;
        int end=a.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if((mid==0 || a[mid]>a[mid-1]) && (mid==a.length-1 || a[mid]>a[mid+1])){
                return mid;
            }
            if(a[mid]<a[mid+1]){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Arraya Size:");
        int size=sc.nextInt();
        System.out.println("Enter Array Element:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print(SearchPeek(arr));
    }
}
