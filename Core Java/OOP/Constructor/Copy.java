// there is no any copy constructor int java
public class Copy {
    
    int id;
    String name;

    // first con
    Copy(int i,String n)
    {
        i=id;
        name=n;
    }
    // second con
    Copy(Copy s)
    {
        id=s.id;
        name=s.name;
    }

    void Display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        Copy c=new Copy(47,"braj");
        Copy c1=new Copy(c);
        c1.Display();
        c.Display();
    }

}
