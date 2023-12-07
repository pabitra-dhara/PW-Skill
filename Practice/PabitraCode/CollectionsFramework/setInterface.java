import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setInterface {
   public static void main(String[] args) {
       HashSet<Integer> hs=new HashSet<>();
       hs.add(1);
       hs.add(2);
       hs.add(3);
       hs.add(48);
       hs.add(15);
       hs.add(10);
       System.out.println(hs);
       
      
    //    hs.remove(2);
    //    System.out.println(hs.contains(2));//false
    //    System.out.println(hs.size());
    //    System.out.println(hs);
    System.out.println("LinkedHashSet:");
    LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
    lhs.add(1);
    lhs.add(2);
    lhs.add(3);
    lhs.add(18);
    lhs.add(15);
    lhs.add(45);
    System.out.println(lhs);

    System.out.println("Tree Set:");
    TreeSet<Integer> ts=new TreeSet<>();
    ts.add(1);
    ts.add(2);
    ts.add(3);
    ts.add(18);
    ts.add(15);
    ts.add(45);
    System.out.println(ts);
   } 
}
