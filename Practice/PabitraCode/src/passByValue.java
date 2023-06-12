class callByValue{
    //call by value
    int change(int a){
        return a*=10;
    }
}





public class passByValue {
 public static void main(String[] args) {
     int a=10;
     System.out.println("This value for main function a :"+a);
     callByValue b=new callByValue();
     System.out.println("This value print for call by Value :"+ b.change(a));
 }   
}