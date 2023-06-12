import java.util.Scanner;
    //Que:given a matrix 'a' of dimension n*m and 2 coondition (l1,r1)and (l2,r2).returm sum (l1,r1)and (l2,r2)
public class metrrixSumFindWithOutAnyloop {
    static void horizenAndVerticalSum(int arr[][]){
        //horizental sum
        int r=arr.length;
        int c=arr[0].length;

        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }

        //vartical sum

        for(int j=0;j<c;j++){
            for(int i=1;i<r;j++){
                arr[i][j]+=arr[i-1][j];
            }
        }
    }

    static int Sum(int arr[][],int l1,int r1,int l2,int r2){
        int ans=0;
        horizenAndVerticalSum(arr);

        int up=0,left=0,leftUp=0;

        if(r1>=1){
        left=arr[l2][r1-1];
        }
        if(l1>=1){
            up=arr[l1-1][r2];
            }        
        if(l1>=1 && r1>=1){
        leftUp=arr[l1-1][r1-1];
        }
        ans=arr[l2][r2]-up-left+leftUp;

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Row Size:");
        int r=sc.nextInt();
        System.out.print("Enter Array Columns Size:");
        int c=sc.nextInt();

        int arr[][]=new int[r][c];
        System.out.println("Enter Array Element:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter L1 Value:");
        int l1=sc.nextInt();
        System.out.print("Enter r1 Value:");
        int r1=sc.nextInt();
        System.out.print("Enter L2 Value:");
        int l2=sc.nextInt();
        System.out.print("Enter r2 Value:");
        int r2=sc.nextInt();  

        System.out.print("Sum:"+ Sum(arr, l1, r1, l2, r2));
    }
}
