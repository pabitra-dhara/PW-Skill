import java.util.Scanner;
//Qus-:Sort an arrays consisting of any 0s and 1s
public class sort0sAnd1sIncresingOrder {

    static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }
//this process use two loop

    // static void sortArrays(int arr[]){
    //     int temp=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==0){
    //             temp++;
    //         }
    //     }

    //     for(int i=0;i<arr.length;i++){
    //         if(i<temp){
    //             arr[i]=0;
    //         }else{
    //             arr[i]=1;
    //         }
    //     }
    // }


    //this process use onle one loop

    static void swapInArray(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }

    static void sortArrays(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swapInArray(arr, left, right);
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter Arrays Element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sortArrays(arr);
        System.out.println("Sorted Arrays:");
        printArray(arr);
    }
}
