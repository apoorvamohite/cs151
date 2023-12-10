package org.example.concurrency;

public class ThreadSubclass extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from a thread!");
        for(int i=0; i<1000; i++) {
            System.out.println(i + " Thread:" + Thread.currentThread().getName());
        }
    }
//    public static void main(String args[]) {
//        (new ThreadSubclass()).run();
//        for(int i=0; i<1000; i++) {
//            System.out.println(i + " Thread:" + Thread.currentThread().getName());
//        }
//    }


}

class Test {
    public static void main(String[] args) {

        new Thread(() -> {

      System.out.println(Thread.currentThread().getPriority());

        }).start();
        Thread.currentThread().setPriority(9);
    }
}

