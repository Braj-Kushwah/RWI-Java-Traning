import java.util.LinkedList;

public class LinkedListDemo {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        LinkedList l=new LinkedList();

        //add()
        l.add("Brajesh");
        l.add("kushwah");
        l.add("knw");
        l.add(null);
        l.add(null);
        System.out.println(l);

        //set()
        l.set(4,"hello");
        System.out.println(l);

        l.set(0,"Braj");
        System.out.println(l);

        //get(),getFirst(),getLast()
        System.out.println(l.get(4));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());

        //remove(), removeFirst(), removelast()
        l.remove(4);
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);

        //addFirst(),addLast()
        l.addFirst("kushwah");
        System.out.println(l);

        l.addLast("Engineer");
        System.out.println(l);
    }
}
