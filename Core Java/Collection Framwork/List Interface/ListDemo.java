import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        //creating a list
        List <String> list=new ArrayList();

        //adding element 
        list.add("Pinaple");
        list.add("Orange");
        list.add("Banana");
        list.add("Apple");

        // Displaying List 
        System.out.println("Fruits List :"+list);

        //Accessing elements by index
        System.out.println("Element at index 2 :"+list.get(1));

        //Updating a element
        list.set(3,"Mango");
        System.out.println("List after Updating :"+list);

        //Removing an elements 
        list.remove(2);
        System.out.println("List after removing :"+list);

        //checking if an element exists
        System.out.println("does the list contain Apple :"+list.contains("Apple"));
        System.out.println("does the list contain Mango :"+list.contains("Mango"));

        //Getting the size of the list
        System.out.println("Size of list :"+list.size());

        //Iterating through a list
        System.out.println("Iterating through the list :");
        for(String fruits:list){
            System.out.println(fruits);
        }

        //sub list of list 
        System.out.println("Sub list of list :"+list.subList(1,3));

        //clearing the list 
        list.clear();
        System.out.println("List after clearing :"+list);
    }
}
