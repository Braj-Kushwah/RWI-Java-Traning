import java.util.Stack;

public class StackDemo {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push("A");
        s.push("B");
        s.push("C");

        System.out.println(s); // [A,B,C]
        System.out.println("popped "+s.pop());

        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s.search("B"));
        System.out.println(s.search("z"));
        System.out.println(s.empty());

    }
}
