package Multithreading.adderSubtractorWithLocks;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {

    Count c;
    Lock lock;

    public Subtractor(Count c, Lock lock) {
        this.c = c;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 1000000; i++){
            lock.lock();
            c.count -= i;
            lock.unlock();
        }
    }
}
