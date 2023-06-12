import java.util.Arrays;
import java.util.Scanner;
public class arrayReference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arrA[]=new int[5];
        for(int i=0;i<arrA.length;i++){
            arrA[i]=sc.nextInt();
        }
        int n=arrA.length;
        int arrB[]=new int[n];
        //in this part call salocopy
        arrA=arrB;
        arrB[0]=7;
        System.out.println("Original Arrays:");
        for(int i=0;i<n;i++){
            System.out.print(arrA[i]);
        }
        System.out.println();
        System.out.println("Reference Arrays:");
        for(int i=0;i<n;i++){
            System.out.print(arrB[i]);
        }
System.out.println();


//this is call deap copy
        int r[]=arrA.clone();
        for(int i=0;i<n;i++){
            System.out.print(r[i]);
        }

        System.out.println();

        //this is call copy of

        int arr[]=Arrays.copyOf(arrA, 2);
        //Akhana 2 thaka prijnt hoba
        arrA[2]=7;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

System.out.println();
        //copy of range
       System.out.println(Arrays.copyOfRange(r, 1, 3));
    }
}
