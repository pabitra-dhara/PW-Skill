import java.util.Scanner;
//Qus-:Find the unique number in a given array where all the elements are repeated twice with one value being unique
class uniqueFinder{
    int finder(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }
}


public class findUniqueElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();


        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        uniqueFinder obj=new uniqueFinder();
        System.out.println(obj.finder(arr));

    }
}

