import java.util.HashSet;

public class HashSetCommonMethod {

    public static void main(String[] args) {
       HashSet<String> st=new HashSet<>();
        //insert new value
        st.add("Pabitra");
        st.add("Subhajit");
        st.add("Pabitra");
        System.out.println(st);
        //check value
        System.out.println(st.contains("Pabitra"));
        System.out.println(st.size());
        //remove value
        st.remove("Pabitra");
        System.out.println(st.contains("Pabitra"));
        System.out.println(st.size());
        st.add("Rudra");
        for(String s:st){
            System.out.println(s);
        }
    }
}