import java.util.Scanner;
/*There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker
starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i 
and i + 1 for all (0 <= i < n). Return the highest altitude of a point.*/
public class bikerGainCalculate {
    static void gainCalculat(int gain[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            max=Math.max(sum,max);
        }
        System.out.print(max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Arrays:");
        int n=sc.nextInt();
        System.out.print("Enter Array Element:");
        int gain[]=new int[n];
        for(int i=0;i<n;i++){
            gain[i]=sc.nextInt();
        }
    gainCalculat(gain);

    }
}
