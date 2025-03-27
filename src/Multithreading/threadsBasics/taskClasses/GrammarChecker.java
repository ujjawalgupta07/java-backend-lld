package Multithreading.threadsBasics.taskClasses;

public class GrammarChecker implements Runnable{

    @Override
    public void run() {
        System.out.println("Checking Grammar ...." + Thread.currentThread().getName() );
    }
}
