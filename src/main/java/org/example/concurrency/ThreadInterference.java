package org.example.concurrency;

class Counter {
    private int c = 0;

    public void increment() {
        for (int i = 0; i < 5000; i++) {
            c++;
        }
    }

    public void decrement() {
        for (int i = 0; i < 5000; i++) {
            c--;
        }
    }

    public int value() {
        return c;
    }

}
public class ThreadInterference {

    public static final int NUM = 1;
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<NUM; i++) {
                    counter.increment();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<NUM; i++) {
                counter.decrement();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.value());
    }
}
