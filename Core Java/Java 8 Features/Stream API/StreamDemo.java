import java.util.*;
import java.util.stream.Collectors;

/**
 * StreamDemo
 */
public class StreamDemo {
    public static void main(String[] args) {
                            // 1
        // Creating a list of integer
        List<Integer> num  = Arrays.asList(1,3,7,4,9,5,0,6);

        // demonstration of map method
        List<Integer> squre = num.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println("List : "+squre);

        // collect method returns a set
        Set<Integer> squareSet = num.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println("Set : "+squareSet);

        // demonstration of forEach method
        num.stream().map(x -> x * x).forEach(y -> System.out.print(y+" "));
        System.out.println();

                            // 2
        // Creating a list of string
        List<String> name = Arrays.asList("Samir", "Raj","Brajesh","Prakash");

        // demonstration of filter method
        List<String> res = name.stream().filter(s -> s.startsWith("B")).collect(Collectors.toList());
        System.out.println(res);

        // demonstration of reduce method
        int even = num.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println(even);

                            // 3
        // demonstration of sorted method
        List<String> sortedName = name.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted names : "+sortedName);
    }
}