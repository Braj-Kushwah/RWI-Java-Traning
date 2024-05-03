import java.util.*;
public class SetDemo {
    public static void main(String[] args) { 
        Set<String> s=new LinkedHashSet<String>();

        s.add("Hello");
        s.add("I");
        s.add("am");
        s.add("Brajesh");
        
        System.out.println(s);
    }
}
