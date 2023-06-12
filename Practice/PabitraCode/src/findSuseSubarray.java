//double sum method

import java.util.Scanner;

public class findSuseSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int s=sc.nextInt();
        int i=0;
        int j=0;
        int sum=0;


        //we can use for loop then display any 2 index use for find S create & display index Number
    
        // for( ;j<n;j++){
        //     sum+=arr[j];
        //     if(sum>s){
        //         for( ;sum>s && i<j;i++){
        //                 sum-=arr[i];
        //         }
        //     }
        //     if(sum==s){
        //         System.out.print(i + " ");
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // but use while loop S number create by use any 1st small index value
        while(j < n){
            sum += arr[j];
            if(sum > s){
            while(sum > s && i < j){
            sum -= arr[i];
            i++;
            }
            }
            if(sum == s){
            System.out.print(i + " ");
            System.out.print(j);
            break;
            }
            j++;
        }
            
            
            
        
    }
}
