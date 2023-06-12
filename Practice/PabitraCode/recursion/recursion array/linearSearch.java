import java.util.Scanner;
public class linearSearch {
    static void finder(int arr[],int terget,int idx){
        if(terget>=arr.length){
            return; 
           
        }
        if(arr[idx]==terget){
            System.out.print("Number Find in Index No:"+idx);
        }
        finder(arr, terget, idx+1);
    }

    // static boolean searching(int arr[],int terget,int idx){
    //     if(terget>=arr.length){
    //         return false;
    //     }
    //     if(arr[idx]==terget){
    //         return true;
    //     }
    //     return searching(arr, terget, idx+1);
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array Element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Searching Element:");
        int terget=sc.nextInt();
        // if(searching(arr, terget, 0)){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("False");
        // }
        finder(arr, terget, 0);
    }
}
