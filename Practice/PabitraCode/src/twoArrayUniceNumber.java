import java.util.Scanner;
public class twoArrayUniceNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Array Size:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.print("Enter 2nd Array Size:");
        int m=sc.nextInt();

        System.out.print("Enter 1st Array Element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int arrb[]=new int[n];
        System.out.println("Enter 2nd Array Element:");

        
        for(int i=0;i<m;i++){
        arrb[i]=sc.nextInt();
        boolean check=false;
            for(int j=0;j<n;j++){
                if(arrb[i]==arr[j]){
                    check=true;
                    break;
                }
            }
            if(!check){
                System.out.print(arrb[i]+" ");
            }
        }
    }
}
