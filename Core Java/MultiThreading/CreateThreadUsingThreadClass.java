/**
 * CreateThreadUsingThreadClass
 */
public class CreateThreadUsingThreadClass extends Thread {

    public void run(){
        System.out.println("Thread Task completed");
    }

    public static void main(String[] args) {
        CreateThreadUsingThreadClass t = new CreateThreadUsingThreadClass();
        t.start();
    }
}