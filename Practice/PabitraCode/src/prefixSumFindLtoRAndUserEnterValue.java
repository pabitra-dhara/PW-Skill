import java.util.Scanner;
//Qus-:l to r sum find 
public class prefixSumFindLtoRAndUserEnterValue {

    static int[] sumFunction(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Arra size:");
        int size=sc.nextInt();

        System.out.println("Enter Arrays Element:");
        int arr[]=new int[size+1];
        for(int i=1;i<=size;i++){
            arr[i]=sc.nextInt();
        }

        int prefSum[]=sumFunction(arr);
        System.out.println("Enter Querise Time:");
        int querise=sc.nextInt();
        while(querise>0){
            System.out.print("Enter Range Start:");
            int l=sc.nextInt();
            System.out.print("Enter Range End:");
            int r=sc.nextInt();
            int ans=prefSum[r]-prefSum[l-1];
            System.out.println("Answer is:" + ans);
            querise--;
        }
    }
}
