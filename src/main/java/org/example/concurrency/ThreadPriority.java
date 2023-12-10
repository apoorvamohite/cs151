package org.example.concurrency;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " is running. Count: " + i);
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");



        // Set thread priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Set the lowest priority
        thread2.setPriority(Thread.MAX_PRIORITY); // Set the highest priority

        // Start the threads
        thread1.start();
        thread2.start();

//        System.out.println("Thread 1 "+thread1.getPriority());
//        System.out.println("Thread 2 "+thread2.getPriority());
    }
}

