import java.util.Scanner;
//Que-: Find the second-largest value in the given array
class maxfinde{
    int fastMax(int arr[]){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
}


class maxFinde2{
    int secendMx(int arr[]){
        maxfinde obj1=new maxfinde();
        int mx=obj1.fastMax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        int secendMax=obj1.fastMax(arr);
        return secendMax;
    }
}


public class findSecondLeargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter Array Element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        // maxfinde obj=new maxfinde();
        // obj.fastMax(arr);

        maxFinde2 obj3=new maxFinde2();
        System.out.println("2nd Max IS:"+ obj3.secendMx(arr));
    }
}
