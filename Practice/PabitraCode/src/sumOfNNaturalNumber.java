import java.util.*;
public class sumOfNNaturalNumber {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int num=1;
        int sum=0;
        //use while loop
        // while (num<=x) {
        //     sum+=num;
        //     num++;
        // }
        //use for loop 
        // for(num=1;num<=x;num++){
        //     sum+=num;
        // }
        // System.out.println(sum);
        do{
            System.out.println(num);
            num++;
        }while(num<=x);
    }
}
