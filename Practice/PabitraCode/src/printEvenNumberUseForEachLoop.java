import java.util.Scanner;
class evenChecker{
    public void checker(){
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter Array Size:");
        // int x=sc.nextInt();

        // System.out.println("Enter Array All Element:");
        // int num[]=new int[];
        // for(int val:num){
        //     num[val]=sc.nextInt();
        // }
        int num[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("In This Element All Even Number Is:");
        for(int valu:num){
            if(valu%2==0){
                System.out.println(valu);
            }
        }
        
    }
}

public class printEvenNumberUseForEachLoop {
    public static void main(String[] args) {
        evenChecker obj1=new evenChecker();
        obj1.checker();
    }
}
