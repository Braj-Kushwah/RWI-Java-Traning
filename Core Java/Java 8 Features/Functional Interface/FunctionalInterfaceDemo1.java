@FunctionalInterface
interface Work{
    public void printHello(); // by default abstract

    default void printName(){
        System.out.println("Brajesh");
    }

    public static void sayHii(){
        System.out.println("Hii");
    }
    // private void letGo(){ // never used it
    //     System.out.println("letgo");
    // }
}
public class FunctionalInterfaceDemo1 implements Work {

    @Override
    public void printHello() {
        System.out.println("Hello");
    }   
    public static void main(String[] args) {
        FunctionalInterfaceDemo1 f = new FunctionalInterfaceDemo1();
        Work.sayHii();
        f.printHello();
        f.printName();
    }
}
