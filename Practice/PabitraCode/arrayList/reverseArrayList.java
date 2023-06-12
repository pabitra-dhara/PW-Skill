import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class reverseArrayList {
    static void reverse(ArrayList<Integer>list){
        int i=0,j=list.size()-1;
        while(i<j){
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      ArrayList<Integer>l2=new ArrayList<>();
      l2.add(5);
      l2.add(6);
      l2.add(7);
      l2.add(8);
      System.out.println("Print Original Array:");
      for(int i=0;i<l2.size();i++){
          System.out.print(l2.get(i)+" ");
      }
      System.out.println();
      reverse(l2);
      System.out.println("Reverce List");
      for(int i=0;i<l2.size();i++){
        System.out.print(l2.get(i)+" ");
    }      
    }
} 
