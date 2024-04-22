abstract class vehical{
    abstract void run();
}
class Car extends vehical{
    void run(){
        System.out.println("Car is running");
    }
}
class Bike extends vehical{
    void run(){
        System.out.println("Bike is running ");
    }
}
public class Demo {

    public static void main(String[] args) {
        Car c = new Car();
        c.run();
        Bike b = new Bike();
        b.run();
    }
}