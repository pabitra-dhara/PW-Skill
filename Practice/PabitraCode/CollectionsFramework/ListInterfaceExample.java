import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterfaceExample {
    static void ArrayListExamples(){
        //ArrayList<Integer> l=new ArrayList<>();
        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(2);
        System.out.println(l);
        System.out.println(l.get(1));
        //modify at index
        l.set(1, 20);
        System.out.println(l);
        System.out.println(l.contains(20));//true

    }
    public static void main(String[] args) {
        ArrayListExamples();
    }
}
