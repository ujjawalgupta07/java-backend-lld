package Multithreading.threadsBasics.taskClasses;

public class StringPrinter implements Runnable {

    public String var;

    public StringPrinter(String var) {
        this.var = var;
    }

    @Override
    public void run() {
        System.out.println("Printing the input String :: " + var + " - BY thread - " + Thread.currentThread().getName());
    }
}
