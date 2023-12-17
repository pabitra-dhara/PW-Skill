import java.awt.print.Printable;
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
        


        //Getting values of a key from the HashMap
        System.out.println(mp.get("Pabitra"));//1
        System.out.println("Ram");//null

        //Changing or Update Value of a key in the HasMap
        mp.put("Rudra",12);
        System.out.println(mp.get("Rudra"));
        System.out.println(mp);
        
        
        //Remove a Pair from the HasMap
        System.out.println(mp.remove("Raja"));//null
        System.out.println(mp.remove("Rudra"));//12
        
        //Checking if a key is in the HashMap
        System.out.println(mp.containsKey("Pabitra"));//true
        System.out.println(mp.containsKey("tega"));//false
        
        //Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Sita",30);// will enter
        mp.putIfAbsent("Pabitra",1);//will not enter
        
        System.out.println(mp);
        
        //get all key in the Hashmap
        
        System.out.println(mp.keySet());
        
        ////get all values in the Hashmap
        System.out.println(mp.values());
        
        //Get all entries in the HashMap
        System.out.println(mp.entrySet());
        
        //Traversing all entries of HashMap - multiple methods
        //1st
        for(String key:mp.keySet()) {
        	System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
        
        System.out.println();
        
        //2nd
        for(Map.Entry<String, Integer> e:mp.entrySet()) {
        	System.out.printf("Age of %s is %d \n",e.getKey(),e.getValue());
        }
        
        System.out.println();
        //2nd short method
        for(var e:mp.entrySet()) {
        	System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
        
    }
    public static void main(String[] args) {
        HashMapMethods();
    }
}
