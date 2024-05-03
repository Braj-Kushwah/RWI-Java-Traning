import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i =1;i<=10;i++){
            v.add(i);
        }
        System.out.println(v);

        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            Integer i = (Integer) e.nextElement();
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println(v);
    }
}
