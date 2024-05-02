class Medical extends Thread{
    public void run() {
        try{
            System.out.println("Medical start");
            Thread.sleep(3000);
            System.out.println("Medical Complete");
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class TestDrive extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("Test drive start");
            Thread.sleep(5000);
            System.out.println("Test Drive Complete");
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class OfficerSign extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("Oficer takes the files");
            Thread.sleep(3000);
            System.out.println("Officer work completed");
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

public class JoinMethDemo extends Thread {
    public static void main(String[] args) throws InterruptedException{
        Medical medi = new Medical();
        medi.start();

        medi.join();

        TestDrive td = new TestDrive();
        td.start();

        td.join();

        OfficerSign as = new OfficerSign();
        as.start();
    }
}
