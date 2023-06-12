import java.util.Scanner;

public class digonalIsNonZeroElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Row Size:");
        int r=sc.nextInt();
        System.out.print("Enter Array Columns Size:");
        int c=sc.nextInt();
        System.out.println("Enter Array Element:");
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[0][0]==0 || arr[r-1][j]==0 || arr[c-1][j]==0 || arr[i][c-1]==0){
                    System.out.print("False");
                    return;
                }
                else{
                    System.out.print("True");
                    return;
                }
            }
            
        }
    }
}
