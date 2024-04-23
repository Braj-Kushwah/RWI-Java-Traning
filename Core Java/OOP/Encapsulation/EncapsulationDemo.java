/**
 * EncapsulationDemo
 */
class Bank{
    protected int getBalance(int balance){
        return balance;
    }
}
public class EncapsulationDemo extends Bank {

    public static void main(String[] args) {
        EncapsulationDemo e = new EncapsulationDemo();
        System.out.println(e.getBalance(25));
    }
}