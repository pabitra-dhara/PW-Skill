
public class printArray {
    static int array(int arr[],int i){
        if(i==arr.length){
            return 0;
        }
        System.out.print(arr[i]);
        return array(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        array(arr, 0);
    }
}