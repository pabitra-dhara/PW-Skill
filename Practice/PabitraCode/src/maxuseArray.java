import java.util.Scanner;
class maxfind{
    int max(){
        Scanner sc=new Scanner(System.in);
        int num[]=new int[5];
        System.out.println("Entre 5 Number:");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>ans){
                ans=num[i];
            }
        }
        return ans;
    }
}
public class maxuseArray {
    public static void main(String[] args) {
        maxfind obj=new maxfind();
        System.out.println("Ans Is "+obj.max());
    }
}
