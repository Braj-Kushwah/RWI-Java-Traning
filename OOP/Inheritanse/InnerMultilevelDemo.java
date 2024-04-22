class A{
    void printA(){
        System.out.println("This is A");
    }
}
class B extends A{
    void printB(){
        System.out.println("This is b");
    }
}
class C extends B{
    void printC(){
        System.out.println("This is C");
    }
}
/**
 * InnerMultilevelDemo
 */
public class InnerMultilevelDemo {

    public static void main(String[] args) {
        C c = new C();
        c.printA();
        c.printB();
        c.printC();
    }
}