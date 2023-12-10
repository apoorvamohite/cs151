package org.example.concurrency;

public class ThreadRunnable implements Runnable {
    public void run() {
        System.out.println("Hello from a thread!" + Thread.currentThread().getName());
    }
    public static void main(String args[]) {
        (new Thread(new ThreadRunnable())).start();
        System.out.println(Thread.currentThread().getName());
    }
}

