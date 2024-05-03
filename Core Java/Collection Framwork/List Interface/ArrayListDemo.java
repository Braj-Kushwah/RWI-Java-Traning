import java.util.ArrayList;

/**
 * ArrayListDemo
 */
public class ArrayListDemo {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        // add() method
        al.add("A");
        al.add(10);
        al.add("A");
        al.add(null);
        System.out.println("Array list :"+al);

        //get() method
        System.out.println(al.get(1));

        //remove() method
        al.remove(2);
        System.out.println(al);

        al.add(2,"B");
        System.out.println(al);

        al.add("N");
        al.add(5.5);
        al.add("A");
        System.out.println(al);

        //set()
        al.set(3,"C");
        System.out.println(al);

        //indexOf()
        System.out.println(al.indexOf("N"));

        //lastIndexOf()
        System.out.println(al.lastIndexOf("A"));

    }
}