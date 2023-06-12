public class possibleLetterOutCome {
    static void combination(String dig,String kp[],String res){
        if(dig.length()==0){
            System.out.print(res+" ");
            return;
        }
        int currentNum=dig.charAt(0)-'0';
        String currChoice=kp[currentNum];
        for(int i=0;i<currChoice.length();i++){
            combination(dig.substring(1), kp, res+currChoice.charAt(i));
        }
    }
    public static void main(String[] args) {
    String s="23";
    String[] kp={"","","abc","def","ghi","jkl","mno","port","tuv","wxyz"};        
    combination(s,kp,"");
    }
}
