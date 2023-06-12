import java.util.Scanner;

class positive{
    public void pos(){
        Scanner sc=new Scanner(System.in);
        int num[]=new int[5];
        System.out.println("Enter All Arrays Element:");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }

        System.out.println("Print All Positive Number:");
        for(int value:num){
            if(value>=0){
                System.out.println(value);
            }
        }
    }
}


public class arrayPossitivValuePrint {
    public static void main(String[] args) {
        positive obj1=new positive();
        obj1.pos();
    }
}
