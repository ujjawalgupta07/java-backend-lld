package Multithreading.adderSubtractorWithSynchronised;

public class Adder implements Runnable {

    Count c;

    public Adder(Count c) {
        this.c = c;
    }

    @Override
    public void run() {
        synchronized (c){
            for(int i = 0 ; i < 1000000 ; i++){
                c.count += i;
            }
        }
    }
}
