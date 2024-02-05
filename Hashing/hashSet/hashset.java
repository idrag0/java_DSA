package Hashing.hashSet;
import java.util.*;
public class hashset {
    public static void main(String args[]){
        HashSet <String> cars= new HashSet<>();

        cars.add("Nissan GTR R35");
        cars.add("porse 911 GT");
        cars.add("Mustang shelby 500");
        cars.add("Challenger");
        cars.add("bmw M 3");
        System.out.println(cars);

        System.out.println(cars.contains("Aston martin"));

        cars.remove("bmw M 3");
        System.out.println(cars+" -> size: "+cars.size());

        // cars.clear();
        // System.out.println(cars);

        //uisng itrators
        System.out.println("Itrators");
        Iterator<String> it = cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
