package org.example.design_patterns.exercise2;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        /*
         * This code is only started when
         * the boiler is empty!
         */
        empty = true;
        boiled = false;
//        System.out.println("Created new instance by thread" + Thread.currentThread().threadId());
    }

    public void fill() {
        /*
         * To fill the boiler it must be empty, and,
         * once it’s full, we set the empty
         * and boiled flags.
         */
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        /*
         * To drain the boiler, it must be full (non-empty)
         * and also boiled. Once it is
         * drained, we set empty back to true.
         */
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
            boiled = false;
        }
    }

    public void boil() {
        /*
         * To boil the mixture, the boiler has to be
         * full and not already boiled. Once
         * it’s boiled, we set the boiled flag to true.
         */
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    private static ChocolateBoiler instance;

    static synchronized ChocolateBoiler getInstance() {
        if(instance == null) {
            instance = new ChocolateBoiler();
        }
        int j = 0;
        for(int i = 0; i< 1000000; i++) {
            j++;
        }
        return instance;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}

class Main {
    public static void main(String[] args) {
        new Thread(() -> {
            ChocolateBoiler cb = ChocolateBoiler.getInstance();
        }).start();

        ChocolateBoiler cb2 = ChocolateBoiler.getInstance();
    }
}
