package Multithreading;


class ThreadyieldMethod extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("child");
            Thread.yield();
    }
    }

public class ThreadYield {
    public static void main(String[] args) {

        ThreadyieldMethod t = new ThreadyieldMethod();
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Parent Main");
        }
    }
}
