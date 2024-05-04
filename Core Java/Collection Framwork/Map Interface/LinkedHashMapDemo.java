import java.util.*;
// import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Braj", 45);
        map.put("Brajesh", 55);
        map.put("Rajesh", 65);
        map.put("Raj", 44);
        map.put("Heloo", 40);
        map.put("Wh", 50);
        map.put("xyz", 75);
        map.put("pqr", 90);
        map.put("Ram", 23);
        map.put("Ok", 43); 
        

        for(Map.Entry<String,Integer> i : map.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
}
