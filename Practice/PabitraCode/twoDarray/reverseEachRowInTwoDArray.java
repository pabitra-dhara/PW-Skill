import java.util.Scanner;
//Qus:reverse array 
public class reverseEachRowInTwoDArray {
    static void print(int arr[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print((arr[i][j])+ " ");
            }
            System.out.println();
        }        
    }
    static void reverse(int arr[][],int r,int c){
        for(int i=0;i<r;i++){
            int a=0;
            int b=c-1;
            while(a<b){
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;
                b--;
            }
        }
        print(arr, r, c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Row:");
        int r=sc.nextInt();
        System.out.print("Enter Array Col:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter Array Element:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array After Reverse:");
        reverse(arr, r, c);
    }
}
