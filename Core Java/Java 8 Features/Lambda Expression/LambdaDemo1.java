// package Core Java.Java 8 Features.Lambda Expression;

@FunctionalInterface
interface Start{
    public void sum(int a,int b);
}
public class LambdaDemo1 {

    public static void main(String[] args) {
        Start s1 = (a,b) -> {
            System.out.println(a+b);
        };
        s1.sum(30,40);
    } 
}
