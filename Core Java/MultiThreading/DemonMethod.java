public class DemonMethod extends Thread{

    @Override
    public void run() {
        System.out.println("Child Thread");
    }
    public static void main(String[] args) {
        System.out.println("Main Thread");
        DemonMethod t = new DemonMethod();
        t.setDaemon(true);
        t.start();
    }
}