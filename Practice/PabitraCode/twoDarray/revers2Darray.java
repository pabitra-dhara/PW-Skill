import java.util.Scanner;

public class revers2Darray {
    static void reversRow(int arr[][],int c,int r){
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
    System.out.println("Reverse of Array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Row Size:");
        int r=sc.nextInt();
        System.out.print("Enter Array Column Size:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter Array Element:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        reversRow(arr, c, r);
    }
}
