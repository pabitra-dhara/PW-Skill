import java.util.Scanner;
//Qus:-Count the number of triplets whose sum is equal to the given value x
class tripletFinder{
    void finder(int arr[],int sum){
        int size=arr.length;
        int count=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                for(int k=j+1;k<size;k++){
                    if(arr[i]+arr[j]+arr[k]==sum){
                        System.out.print(arr[i] +" "+ arr[j] +" " + arr[k]+" ");
                        count++;
                    }
                }
                System.out.println();
            }
        }
        System.out.print("This Array Triplet Number Find in "+count+" Time");        
    }
}


public class tripletSumMethodInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int sum=sc.nextInt();

        tripletFinder obj=new tripletFinder();
        obj.finder(arr, sum);

    }

}
