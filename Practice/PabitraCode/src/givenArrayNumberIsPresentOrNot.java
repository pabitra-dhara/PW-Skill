import java.util.Scanner;
//Que-:Given Queries check if the given number is present in the array or not
//Note-:Value Of all the elemets int the array is less then 10 to the power 5
public class givenArrayNumberIsPresentOrNot {

    static int[] frequence(int arr[]){
        int freq[]=new int[100000];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]=freq[arr[i]]+1;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();


        int arr[]=new int[size];

        System.out.println("Enter Array Element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter You can find  Queries Number:");
        int q=sc.nextInt();


        int freq[]=frequence(arr);

        for(int i=q-1;i>=0;i--){
            System.out.print("Enter Your Searching Valu:");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
