import java.util.Scanner;

public class elementSortIndexPrint {
    static void sort1(int arr2[]){
        boolean flag=false;
        for(int i=0;i<arr2.length-1;i++){
            for(int j=0;j<arr2.length-i-1;j++){
                if(arr2[j]>arr2[j+1]){
                    int temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                    flag=true;
                }                
            }
            if(flag==false){
                return;
            }
        }
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        System.out.println("Enter Array Element:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int arr2[]=arr.clone();
        sort1(arr2);
        int pos=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr[j]==arr2[i]){
                    arr[j]=j;      
                    pos++; 
                    break;
                }
            }
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
    }
}
