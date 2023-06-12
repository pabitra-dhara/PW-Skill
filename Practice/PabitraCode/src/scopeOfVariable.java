class algebra{
    int a=10;
    int b=9;
    //start for class level scope of variable
    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    //starting for method level scope of variable
    int mul(){
        int p=5;
        int q=3;
        return p*q;
    }
    //block level scope
    // System.out.print(r);
    {
        int r=4;
        System.out.println(r);
    }
}





public class scopeOfVariable {
    public static void main(String[] args) {
        algebra a=new algebra();
        System.out.println(a.add());
        System.out.println(a.sub());

        System.out.println("This is for method level variable:"+ a.mul());

    }
}