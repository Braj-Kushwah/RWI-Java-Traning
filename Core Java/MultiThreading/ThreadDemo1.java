public class ThreadDemo1 extends Thread{
    
    public void run(){
        System.out.println("Task1");
    }
    public static void main(String[] args) {
        ThreadDemo1 t = new ThreadDemo1();
        t.start();
    }
}
