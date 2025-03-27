package Multithreading.threadsBasics.taskClasses;

public class AutoCorrector implements Runnable{

    @Override
    public void run() {
        System.out.println("Auto correcting ......" + Thread.currentThread().getName());
    }
}
