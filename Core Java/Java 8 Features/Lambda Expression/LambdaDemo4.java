interface Factorial{
    public void findFact(long n);
}

public class LambdaDemo4 {
    public static void main(String[] args) {
        Factorial f1 = n ->{
            long res = 1;
            for(long i = 1; i<=n;i++){
                res *= i;
            }
            System.out.println("Fact is "+res);
        };
        f1.findFact(7);
    }
}