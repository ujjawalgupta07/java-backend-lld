package Multithreading.adderSubtractorWithLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Driver {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        Count c = new Count();
        Adder a = new Adder(c, lock);
        Subtractor s = new Subtractor(c, lock);

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(c.count);
    }

}
