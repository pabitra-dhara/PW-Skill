import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterFace {
    public static void main(String[] args) {
        System.out.println("HashMap:");
        Map<Integer,String> mp=new HashMap<>();
        mp.put(1,"Pabitra");
        mp.put(3,"Priyanka");
        mp.put(2,"Kartick");
        mp.put(4,"Lipika");

        // //Iterating over keys in a map
        // for(var i:mp.keySet()){
        //     System.out.println(i);
        // }
        // //Iterating over valus in a map
        // for(var i:mp.values()){
        //     System.out.println(i);
        // }

        //Iterating over keys,valus in a map
        for(var e:mp.entrySet()){
            System.out.println(e.getValue());
            System.out.println(e);
        }

        // System.out.println(mp.entrySet());
        // System.out.println(mp.values());
        // mp.put(4, "Ram");
        // System.out.println(mp);
        // System.out.println(mp.get(2));
        // System.out.println(mp.containsKey(4));
        // System.out.println(mp.containsValue("Dhara"));

        System.out.println("\n\n\nLinked HashMap");
        Map<Integer,String> hmp=new LinkedHashMap<>();
        hmp.put(1,"Pabitra");
        hmp.put(3,"Priyanka");
        hmp.put(2,"Kartick");
        hmp.put(4,"Lipika");
        for(var e:hmp.entrySet()){
            System.out.println(e.getValue());
        }


        System.out.println("\n\n\nTree Map:");
        Map<Integer,String> tmp=new TreeMap<>();
        tmp.put(1,"Pabitra");
        tmp.put(3,"Priyanka");
        tmp.put(2,"Kartick");
        tmp.put(4,"Lipika");
        for(var e:tmp.entrySet()){
            System.out.println(e.getValue());
        }
    }
}
