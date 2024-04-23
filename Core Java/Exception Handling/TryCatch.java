public class TryCatch {
    public static void main(String[] args) {
        System.out.println("statment 1");
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("cant devide by zero");
        }
        System.out.println("statment 2");
    }
}
