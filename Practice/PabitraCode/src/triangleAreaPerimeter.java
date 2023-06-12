import java.lang.Math;
class triangle{
    int a,b,c;
    public double getArea(){
    double s=(a+b+c)/2.0;
    return Math.pow(s*(s-a)*(s-b)*(s-c),.5);
}
public double getdata(){
    return (a+b+c)/2;
}
}
/**
 * triangleAreaPerimeter
 */
public class triangleAreaPerimeter {

    public static void main(String[] args) {
        triangle t=new triangle();
        t.a=2;
        t.b=5;
        t.c=6;
        System.out.println(t.getdata());
        System.out.println(t.getArea());
    }
}