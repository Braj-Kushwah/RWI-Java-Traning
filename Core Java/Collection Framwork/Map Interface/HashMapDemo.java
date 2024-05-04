import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Vishal", 10);
        hm.put("Sachin", 30);
        hm.put("Vaibhav", 40);

        for(Map.Entry<String,Integer> e : hm.entrySet()){
            System.out.println(e.getKey()+" - "+e.getValue());
        }
    }
}
