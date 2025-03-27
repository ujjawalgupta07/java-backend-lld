package Multithreading.executors;


import Multithreading.threadsBasics.taskClasses.StringPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i = 0 ; i < 10; i++){
            executorService.submit(new StringPrinter(String.valueOf(i)));
        }

        executorService.shutdown();

        Client client = new Client();
        client.print();
    }

    public static void print(){
        System.out.println("hi");
    }

}
