import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(15);
        ts.add(78);
        ts.add(10);
        ts.add(15); 

        // ts.add(null); Null pointer exception
        System.out.println(ts);
    }
}
