import java.util.Scanner;

public class pascalTriangle2DArray {
    static void triangle(int n){
        int ans[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i)
                    ans[i][j]=1;
                else
                    ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
                
            }
        }
        int sps=n-1;
        for(int i=0;i<n;i++){
            for(int k=0;k<sps;k++){
                System.out.print(" ");
            }
            sps--;
            for(int j=0;j<=i;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Pascal's Triangle Size:");
        int n=sc.nextInt();
        triangle(n);

    }
}
