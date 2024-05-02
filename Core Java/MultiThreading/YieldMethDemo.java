public class YieldMethDemo extends Thread {

    @Override
    public void run() {
        for(int i =1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
    public static void main(String[] args) {
        YieldMethDemo t1 = new YieldMethDemo();
        t1.start();

        Thread.yield();

        for(int i =1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
    
}
