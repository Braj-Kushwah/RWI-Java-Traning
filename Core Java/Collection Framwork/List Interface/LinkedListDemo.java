import java.util.LinkedList;

public class LinkedListDemo {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();

        //add()
        ll.add("Brajesh");
        ll.add("kushwah");
        ll.add("knw");
        ll.add(null);
        ll.add(null);
        System.out.println(ll);

        //set()
        ll.set(4,"hello");
        System.out.println(ll);

        ll.set(0,"Braj");
        System.out.println(ll);

        //get(),getFirst(),getLast()
        System.out.println(ll.get(4));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        //remove(), removeFirst(), removelast()
        ll.remove(4);
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);

        //addFirst(),addLast()
        ll.addFirst("I am");
        System.out.println(ll);

        ll.addLast("Engineer");
        System.out.println(ll);
    }
}
