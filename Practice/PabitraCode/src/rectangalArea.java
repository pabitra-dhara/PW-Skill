import java.util.Scanner;
class Area{
    int le,br;
    public Area(int l,int b){
        le=l;
        br=b;
    }
    public int printArea(){
        return le*br;
    }
}
public class rectangalArea {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int l,b;
      System.out.print("Enter Length Of rectangle:");
      l=sc.nextInt();
      System.out.print("Enter breadth of rectangle:");
      b=sc.nextInt();
      Area a=new Area(l,b);
      System.out.print("Area Of rectangel:"+a.printArea());

    }
}
