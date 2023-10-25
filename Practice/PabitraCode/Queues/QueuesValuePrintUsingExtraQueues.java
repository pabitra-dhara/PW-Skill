import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueuesValuePrintUsingExtraQueues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> qe=new LinkedList<>();
        int s=sc.nextInt();
        for(int i=0;i<s;i++){
            qe.add(sc.nextInt());
        }
        Queue<Integer> helper=new ArrayDeque<>();
        while(qe.size()!=0){
            System.out.print(qe.peek()+"  ");
            helper.add(qe.poll());
        }
        while (helper.size()!=0) {
            qe.add(helper.remove());
        }
    }
}