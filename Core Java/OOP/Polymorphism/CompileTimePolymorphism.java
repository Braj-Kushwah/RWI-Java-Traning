public class CompileTimePolymorphism {

    static int sum(int a ,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(23,56));
        System.out.println(sum(23, 67,90));
    }
}