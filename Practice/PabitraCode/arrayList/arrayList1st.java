import java.util.ArrayList;

public class arrayList1st {
public static void main(String[] args) {
    ArrayList<Integer>l1=new ArrayList<>();
    //add new element
    l1.add(5);
    l1.add(6);
    l1.add(7);
    l1.add(8);
    //print element
    System.out.println("Print Array List With out Array List:");
    System.out.println(l1.get(0));
    System.out.println(l1.get(1));
    System.out.println(l1.get(2));
    System.out.println(l1.get(3));

    //print with for loop
    System.out.println("Print Arrray List Use For Loop:");
    for(int i=0;i<l1.size();i++){
        System.out.println(l1.get(i));
    }
    //print array all element with out any loop
    System.out.println("print array all element with out any loop");
    System.out.println(l1);
    //add element in arrya
    System.out.println("add element in arrya");
    l1.add(0,4);
    System.out.println(l1);

    //modifiying Element i index
    System.out.println("Modifying Element i index");
    l1.set(0,3);
    System.out.println(l1);
    
    //remove an element at index i
    System.out.println("remove an element at index i");
    l1.remove(1);
    System.out.println(l1);

    //removing element with out index number
    System.out.println("removing element with out index number");
    l1.remove(Integer.valueOf(7));
    System.out.println("remove 7"+l1);

}
    
}