package org.example.design_patterns;

public class SingletonRace {
    public static void main(String[] args) {
        new Thread(() -> {
            MySingleton.getInstance();
        }).start();
        new Thread(() -> {
            MySingleton.getInstance();
        }).start();
        MySingleton.getInstance();
    }
}

class MySingleton {

    static Object lock = new Object();
    private static MySingleton instance;

//    private MySingleton() {
//        System.out.println("New instance created by " + Thread.currentThread().threadId());
//    }

    public static synchronized MySingleton getInstance() {
        synchronized (lock) {
//            Thread.sleep(10000);
            if (instance == null) {
                instance = new MySingleton();
            }
            return instance;
        }
    }
}
