import java.util.*;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> ts = new TreeSet<>();

        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");

        // adding the duplicate element
        ts.add("India");

        System.out.println(ts);

        // remmoving
        ts.remove("Australia");
        System.out.println(ts);

        Iterator<String> itr = ts.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

    }
}
