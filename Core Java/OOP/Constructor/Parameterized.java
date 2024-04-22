public class Parameterized {
    
    int id;
    String name;
    Parameterized(int i,String n)
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id+"  "+name);
    }
    public static void main(String[] args) {
        Parameterized p1=new Parameterized(43, "Nandni");
        Parameterized p2=new Parameterized(47, "Brajesh");

        p1.display();
        p2.display();
    }
}
