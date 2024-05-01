import javax.xml.namespace.QName;

public class CreateThreadUsingRunnableInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Completed");
    }
    public static void main(String[] args) {
        CreateThreadUsingRunnableInterface t = new CreateThreadUsingRunnableInterface();
        Thread th = new Thread(t);
        th.start();
    }
}
