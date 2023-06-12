// import java.util.Scanner;
// public class aStringEverycharcterlexicographicalOrder{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the string: ");
//                 String s = sc.nextLine();
//                 char[] arr = s.toCharArray();
//                 //insertion sort
//                 for (int i = 1; i < arr.length; i++) {
//                         int j = i;
//                         // Insert a[i] into sorted left part 0..i-1
//                         while (j > 0 && arr[j] < arr[j - 1]) {
//                                 // Swap a[j] and a[j-1]
//                                 char temp = arr[j];
//                                 arr[j] = arr[j-1];
//                                 arr[j-1] = temp;
//                                 // Decrement j by 1
//                                 j--;
//                         }
//                 }
//                 String ans ="";
//                 for(int i = 0; i < arr.length; i++){
//                 ans += arr[i];
//                 }
//                 System.out.println(ans);
//             }
// }
import java.util.Scanner;

public class aStringEverycharcterlexicographicalOrder {
    static void sort(String w){
        char arr[]=w.toCharArray();
        for(int i=0;i<w.length()-1;i++){
            for(int j=i+1;j<w.length()-1;j++){
                if(arr[j]<arr[j-1]){
                    char temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        String ans="";
        for(int i=0;i<w.length();i++){
            ans+=arr[i];
        }
        System.out.print("Array is print into lexicographical order:"+ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Write A Word:");
        String word=sc.next();
        sort(word);
    }
}

