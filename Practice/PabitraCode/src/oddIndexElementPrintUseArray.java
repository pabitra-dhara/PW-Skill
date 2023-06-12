class IndexCheck{
    public void odd(){
        String arr[]={"ab","bc","cd","de","ef","fg","gh"};
        System.out.print("Odd Index Value Is:");
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                System.out.print(arr[i]+"  ");
            }
        }
    }
}

public class oddIndexElementPrintUseArray {
    public static void main(String[] args) {
        IndexCheck obj1=new IndexCheck();
        obj1.odd();
    }
}
