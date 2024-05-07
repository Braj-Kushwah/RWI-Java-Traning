interface Work{
    public void isEven(int x);
}
public class LambdaDemo2 {
    public static void main(String[] args) {
        Work w = (x)->{
            if(x %2==0){    
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        };
        w.isEven(10);
    }
}
