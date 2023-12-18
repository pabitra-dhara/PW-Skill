import java.util.Arrays;

public class CheckTwoArrayIsContentOrNot {
    public static void main(String[] args) {
        int arr1[]={1,2,5,4,0};
        int arr2[]={2,4,5,0,1};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                count++;
                System.out.println("False");
                break;
            }
        }
        if(count==0){
            System.out.println("True");
        }
    }
}
