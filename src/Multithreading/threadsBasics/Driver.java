package Multithreading.threadsBasics;

import Multithreading.threadsBasics.taskClasses.AutoCorrector;
import Multithreading.threadsBasics.taskClasses.GrammarChecker;

public class Driver {
    public static void main(String[] args) {
        Thread ac = new Thread(new AutoCorrector());
        ac.start();
        Thread gc = new Thread(new GrammarChecker());
        gc.start();
    }

    /**
     * Write a function to print the two things in parallel
     * 1. Print GrammarChecks
     * 2. Print AutoCorrect
     *
     * using multi-threading
     */
}