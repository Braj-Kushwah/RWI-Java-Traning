// package Core Java.Exception Handling;

public class ThrowDemo extends RuntimeException{
    public ThrowDemo(String msg){
        super(msg);
    }
    public static void main(String[] args) {
        int age = 20;
        if (age < 18) {
            throw new ThrowDemo("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote");
        }
    }
}