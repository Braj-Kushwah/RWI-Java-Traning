import java.util.*;
public class ListIteratorDemo {
   public static void main(String[] args) {
      LinkedList<Integer> ll = new LinkedList<>();
      ll.add(1);
      ll.add(5);
      ll.add(6);
      ll.add(10);
      System.out.println(ll);

      ListIterator<Integer> itr = ll.listIterator();
      while(itr.hasNext()){
         Integer i = itr.next();
         if(i.equals(5)){
            itr.remove();
         }
      }
      System.out.println(ll);
   } 
}
