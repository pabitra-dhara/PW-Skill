import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class hashmapStart {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Integer,String> st=new HashMap<>();
        System.out.println("Enter Element:");
        for(int i=1;i<=3;i++){
            st.put(sc.nextInt(),sc.nextLine());
        }
        System.out.println("Output:");
        for(var i:st.entrySet()){
            System.out.print(i);
        }
    }
}