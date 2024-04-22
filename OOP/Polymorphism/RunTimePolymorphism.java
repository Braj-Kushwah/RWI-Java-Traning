class Demo{
    public int sum(int a , int b){
        return a+b;
    }
}

public class RunTimePolymorphism extends Demo{
    public int sum(int a ,int b){
        return a-b;
    }
    public static void main(String[] args) {
        RunTimePolymorphism r = new RunTimePolymorphism();
        Demo t = new Demo();
        System.out.println(r.sum(56, 23));
        System.out.println(t.sum(50, 30));
    }
}
