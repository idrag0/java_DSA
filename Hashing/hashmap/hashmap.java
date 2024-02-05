package Hashing.hashmap;

import java.util.HashMap;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        HashMap <String,Integer> Hm = new HashMap<>();

        //Insert element
        Hm.put("india",6);
        Hm.put("usa", 1);
        Hm.put("Canada", 2);
        Hm.put("Saudia",64);

        //Iterate fpr printing
        Set<String> keys = Hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("key = "+k+" , Value = "+Hm.get(k));
        }
    }
}
