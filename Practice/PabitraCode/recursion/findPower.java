import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

// public class findPower {
//     static int power(int p,int q){
//         if(p==0){
//             return 0;
//         }
//         else if(q==0){
//             return 1;
//         }
//         return p*power(p,q-1);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter P Value:");
//         int p=sc.nextInt();
//         System.out.print("Enter Q Value:");
//         int q=sc.nextInt();
//         System.out.print("Power is:"+power(p, q));
//     }
// }

public class findPower {
    static int find(int p,int q){
        if(q==0){
            return 1;
        }
            int small=find(p, q/2);
            if(q%2==0){
                return small*small;
        }
        return p*small*small;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter P Value:");
        int p=sc.nextInt();
        System.out.print("Enter Q Value:");
        int q=sc.nextInt();
        System.out.print("Power is:"+find(p, q));
    }
    
}