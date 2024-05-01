public class ThreadDemo2 extends Thread {
    @Override
    public void run() {
        System.out.println("Task1");
    }
    public static void main(String[] args) {
        ThreadDemo2 t1 = new ThreadDemo2();
        t1.start();

        ThreadDemo2 t2 = new ThreadDemo2();
        t2.start();
    }
}
