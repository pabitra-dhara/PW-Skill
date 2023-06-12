import java.util.Scanner;
class searching{
    
    void proces(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size=sc.nextInt();
        int num[]=new int[size];
        System.out.println("Enter Array All Element:");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }

        int x;
        System.out.println("Enter Your Searching Element:");
        x=sc.nextInt();
        for(int i=0;i<num.length;i++){
            if(num[i]==x){
                System.out.print("Element Is Find Possition Number:"+ (i+1));
            }        
        }

    }
}
public class linearSearch {
    public static void main(String[] args) {
        searching obj1=new searching();
        obj1.proces();
    }
}
