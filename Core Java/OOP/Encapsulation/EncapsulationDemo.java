import java.util.Scanner;

/**
 * EncapsulationDemo
 */
class EncapsulationDemo{
    private float principle;
    private float rate;
    private float  time;
    private float simpleInterest;

    Scanner sc = new Scanner(System.in);
    void getPara(){
        System.out.println("Enter principle");
        principle = sc.nextFloat();
        System.out.println("Enter the rate of interest");
        rate = sc.nextFloat();
        System.out.println("Enter the time");
        time = sc.nextFloat();
    }
    void findIntereset(){
        simpleInterest = (principle * rate * time)/100;
    }
    void show(){
        System.out.println("THe Simple Interest "+simpleInterest);
    }
    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.getPara();
        obj.findIntereset();
        obj.show();
    }
}
