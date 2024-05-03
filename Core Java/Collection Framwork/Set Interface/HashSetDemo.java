import java.util.HashSet;

class Demo{
    int id;
    String name;
    double salary;
    public Demo(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
public class HashSetDemo {
    public static void main(String[] args) {
        
        HashSet<Demo> hs = new HashSet<Demo>();

        Demo d1 = new Demo(1, "Brajesh",22000);
        Demo d2 = new Demo(2, "ruhi", 23000);
        Demo d3 = new Demo(2, "Nandu", 25000);
        Demo d4 = new Demo(4, "Raj", 20000);

        hs.add(d1);
        hs.add(d2);
        hs.add(d3);
        hs.add(d4);

        for(Demo d : hs){
            System.out.println("Employee Id : "+d.id+"\n"+"Employee Name : " +d.name + "\n" +"Employee Salry : "+ d.salary);
        }
        System.out.println();
    }  
}
