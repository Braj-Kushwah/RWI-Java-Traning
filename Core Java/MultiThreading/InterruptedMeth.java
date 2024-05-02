public class InterruptedMeth extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        try{
            for(int i = 1;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
                // System.out.println(Thread.interrupted());
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        InterruptedMeth t = new InterruptedMeth();
        t.start();
        Thread.interrupted();
    }
}
