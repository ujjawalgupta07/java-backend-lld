package LambdasStreamsAndExceptions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LambdasClient {
    public static void main(String[] args) {
        // instead of creating a class, you just implemented method

        Runnable runnable = () -> {
            System.out.println("Hello World");
        };

        Thread thread = new Thread(runnable);
        thread.start();


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.sort(list,  (a1, a2) -> {
            if(a1 % 2 != 0){
                return -1;
            }
            else if(a2 % 2 != 0){
                return 1;
            }
            else
                return 0;
        });

        System.out.println(list);
    }
}