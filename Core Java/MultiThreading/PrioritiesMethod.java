public class PrioritiesMethod extends Thread{
    @Override
    public void run() {
        System.out.println("Child Thread");
        System.out.println("Child Thread priority : "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println("Main Thread default priority : "+Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(MAX_PRIORITY);
        System.out.println("Main Thread new priority : "+Thread.currentThread().getPriority());

        PrioritiesMethod t = new PrioritiesMethod();
        t.start();
    }
}
