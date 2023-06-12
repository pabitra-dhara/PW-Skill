import java.util.Scanner;
class lastIndexfinder{
    int finder(int arr[],int x){
        int last=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                last=i;
            }
        }
        return last;
    }
}


public class arrayXelementLastIndexFind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        System.out.println("Enter Array Element:");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter A Number You can Find Last Index:");
        int x=sc.nextInt();

        lastIndexfinder obj=new lastIndexfinder();
        System.out.print("Last Index Is :"+ obj.finder(arr, x));
    }
}
