package Multithreading;

class ThreadName extends Thread{

}
public class TestThread {
    public static void main(String[] args) {


        System.out.println(Thread.currentThread().getName());

        ThreadName t = new ThreadName();
        System.out.println(t.getName());

        Thread.currentThread().setName("Explicit Thread");
        System.out.println(Thread.currentThread().getName());

    }
}
