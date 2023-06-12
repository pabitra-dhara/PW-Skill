import java.util.Scanner;

class Addition{
    public void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array Element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println("Sum Of Array:"+sum);
    }
}




public class sumOfArray {

    public static void main(String[] args) {
        Addition obj1=new Addition();
        obj1.sum();
    }
}
