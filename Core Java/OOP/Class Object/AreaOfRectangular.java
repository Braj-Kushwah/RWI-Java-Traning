/**
 * AreaOfRectangular
 */
/* 
public class AreaOfRectangular {

    float height;
    float withd;
    float area;

    void findarea()
    {
        area=height*withd;
        System.out.println("area of ractangular is "+area);
    }
    public static void main(String[] args) {
        AreaOfRectangular a=new AreaOfRectangular();
        a.withd=25;
        a.height=25;
        a.findarea();
    }
}
*/

// diff meth

/**
 * AreaOfRectangular
 */
public class AreaOfRectangular {

    float h;
    float w;
    float area;
    void getPara()
    {
        h=34;
        w=56;
    }
    void findarea()
    {
        area=h*w;
        System.out.println("area of ractangular is "+area);
    }
    public static void main(String[] args) {
        AreaOfRectangular s=new AreaOfRectangular();
        s.getPara();
        s.findarea();
    }
}