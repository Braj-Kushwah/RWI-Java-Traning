class A{
    void showA(){
        System.out.println("This is A");
    }
}
class B extends A{
    void showB(){
        System.out.println("This is B");
    }
}
/**
 * SingleDemo
 */
public class SingleDemo {

    public static void main(String[] args) {
        B b = new B();
        b.showA();
        b.showB();
    }
}