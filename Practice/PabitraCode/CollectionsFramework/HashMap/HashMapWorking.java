import java.util.HashMap;
import java.util.Map;

public class HashMapWorking {
    static void HashMapMethods(){
        //Syntex
        Map<String,Integer> mp=new HashMap<>();
        //Insert
        mp.put("Pabitra",1);
        mp.put("Rudra",2);
        mp.put("Subha",3);

        //Gatting values of a key from the HashMap
        System.out.println(mp.get("Pabitra"));//1
        System.out.println("Ram");//null

        //Changing or Update Value of a key in the HasMap
        mp.put("Rudra",12);
        System.out.println(mp.get("Rudra"));
        System.out.println(mp);

    }
    public static void main(String[] args) {
        HashMapMethods();
    }
}
