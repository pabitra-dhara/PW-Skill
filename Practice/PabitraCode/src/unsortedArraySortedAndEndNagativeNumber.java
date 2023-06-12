import java.util.Scanner;
/**
 * unsortedArraySortedAndEndNagativeNumber
 */
public class unsortedArraySortedAndEndNagativeNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Array Size:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter Arrays Element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }


        int ans[]=new int[size];
        int idx=0;

        for(int i=0;i<size;i++){
            if(arr[i]>=0){
                ans[idx]=arr[i];
                idx++;
            }
        }


        for(int i=0;i<size;i++){
            if(arr[i]<0){
                ans[idx]=arr[i];
                idx++;
            }
        }
        System.out.print("Finaly Sorted This Arrys:");
        for(int i=0;i<size;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
