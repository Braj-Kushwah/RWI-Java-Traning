import java.util.*;

/**
 * LambdaDemo3
 */
public class LambdaDemo3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(6);

        System.out.println(list);

        List<Integer> unique_list = new ArrayList<>();

        list.stream().distinct().forEach(unique_list :: add);

        System.out.println(unique_list);

    }
}