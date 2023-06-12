import java.util.Scanner;
public class sumFindrange {
    //Que3:sum find with out any loop
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Row & Colume:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("Enter Array Element:");
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter Starting Range of Row:");
        int srow=sc.nextInt();
        System.out.print("Enter Ending Range of Row:");
        int erow=sc.nextInt();

        System.out.print("Enter Starting Range of Colume:");
        int scol=sc.nextInt();
        System.out.print("Enter Ending Range of Colume:");
        int ecol=sc.nextInt();

        int sum=0;
        while(srow<=erow){
            int j=scol;
            while(j<=ecol){
                sum+=arr[srow][j];
                j++;
            }
            srow++;
        }
        System.out.print("Sum is:"+sum);
    }
}
