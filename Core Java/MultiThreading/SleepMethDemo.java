public class SleepMethDemo extends Thread {
    @Override
    public void run() {
        try{
            for(int i =1;i<=5;i++){
                System.out.println(i+" : "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        SleepMethDemo t1 = new SleepMethDemo();
        t1.start();

        SleepMethDemo t2 = new SleepMethDemo();
        t2.start();
    }
}
