import java.util.Scanner;
public class spiralMetrix {
    static void spiral(int arr[][],int r,int c){
        int toprow=0,rightcol=c-1,bottomrow=r-1,leftcol=0;
        int k=0;
        while(k<r*c){
            //toprow
            for(int j=leftcol;j<=rightcol && k<r*c;j++){
                System.out.print(arr[toprow][j]+" ");
                k++;
            }
            toprow++;
            //rightcol
            for(int j=toprow;j<=bottomrow && k<r*c;j++){
                System.out.print(arr[j][rightcol]+" ");
                k++;
            }
            rightcol--;
            //bottomrow
            for(int j=rightcol;j>=leftcol && k<r*c;j--){
                System.out.print(arr[bottomrow][j]+" ");
                k++;
            }
            bottomrow--;
            //leftcol
            for(int i=bottomrow;i>=toprow && k<r*c;i--){
                System.out.print(arr[i][leftcol]+" ");
                k++;
            }
            leftcol++;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Row Size:");
        int r=sc.nextInt();
        System.out.print("Enter Array Columes Size:");
        int c=sc.nextInt();

        System.out.println("Enter Array Element:");
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        spiral(arr, r, c);
    }
}
