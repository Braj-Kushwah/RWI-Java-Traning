// public class NamingMethodDemo extends Thread {
//     public static void main(String[] args) {
//         System.out.println("Hello");
//         System.out.println(Thread.currentThread().getName());

//         Thread.currentThread().setName("Brajesh");

//         System.out.println("New Thread Name : "+ Thread.currentThread().getName());
//     }
// }


// Demo 2

/**
 * NamingMethodDemo
 */
// public class NamingMethodDemo extends Thread{
//     @Override
//     public void run() {
//         System.out.println(Thread.currentThread().getName());
//         System.out.println("Thread Task");
//     }

//     public static void main(String[] args) {
//         NamingMethodDemo n = new NamingMethodDemo();
//         n.start();
//         System.out.println(Thread.currentThread().getName());

//         System.out.println(Thread.currentThread().isAlive());

//         System.out.println(n.isAlive());
//     }
// }

// Demo 3 

/**
 * NamingMethodDemo
 */
public class NamingMethodDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Thread Task : "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Hello : "+Thread.currentThread().getName());

        NamingMethodDemo t1 = new NamingMethodDemo();
        t1.setName("Brajesh");
        t1.start();

        NamingMethodDemo t2 = new NamingMethodDemo();
        t2.setName("Programming");
        t2.start();

    }    
}