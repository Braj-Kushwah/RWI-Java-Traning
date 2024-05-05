import java.util.*;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<Integer,String> map =  new TreeMap<>();
        map.put(1, "Braj");
        map.put(2, "Brajesh");
        map.put(3, "Raj");
        map.put(4, "Sallo");
        map.put(5, "Ruhi");
        map.put(6, "Nandu");
        map.put(7, "Ram");

        for(Map.Entry<Integer,String> i : map.entrySet()){
            System.out.println(i.getKey()+" : "+i.getValue());
        }
    }
}