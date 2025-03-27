package Multithreading.adderSubtractorWithSynchronised;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {

    Count c;

    public Subtractor(Count c) {
        this.c = c;
    }

    @Override
    public void run() {
        synchronized (c) {
            for (int i = 0; i < 1000000; i++) {
                c.count -= i;
            }
        }
    }
}
