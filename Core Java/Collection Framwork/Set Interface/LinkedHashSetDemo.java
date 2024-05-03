import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(34);
        hs.add(78);
        hs.add(12);
        hs.add(90);
        hs.add(10);
        hs.add(40);

        System.out.println(hs.add(90)); /// false

        System.out.println(hs);

        for(int i : hs){
            System.out.print(i+" ");
        }
    }
}
