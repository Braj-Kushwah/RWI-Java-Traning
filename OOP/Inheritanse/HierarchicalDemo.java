
class A{
    void printA(){
        System.out.println("This is A");
    }
}
class B extends A{
    void printB(){
        System.out.println("This is B");
    }
}
class C extends A{
    void printC(){
        System.out.println("This is C");
    }
}
/**
 * HierarchicalDemo
 */
public class HierarchicalDemo {

    public static void main(String[] args) {
        A a = new A();
        a.printA();
        // a.printB(); // error
        // a.printC();

        B b = new B();
        b.printA();
        b.printB();
        // b.printC();

        C c = new C();
        c.printA();
        // c.printB();
        c.printC();
    }
}