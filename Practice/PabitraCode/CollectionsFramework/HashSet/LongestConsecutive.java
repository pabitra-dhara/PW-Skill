import java.util.HashSet;

public class LongestConsecutive {
    public static int MaxLength(int nums[]){
        HashSet<Integer> st=new HashSet<>();
        for(int num:nums) st.add(num);

        int maxLength=Integer.MIN_VALUE;
        for(int num:st){
            if(!st.contains(num-1)){
                int currnum=num;
                int currStreak=1;//length of consicutive sequence
                while(st.contains(currnum+1)){
                    currStreak++;
                    currnum++;
                }
                maxLength=Math.max(currStreak,maxLength);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int nums[]={100,4,200,1,3,2};
        System.out.println(MaxLength(nums));
    }
}
