import java.util.ArrayList;

public class ListInterfaceExample {
    static void ArrayListExamples(){
        ArrayList<Integer> l=new ArrayList<>();
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
