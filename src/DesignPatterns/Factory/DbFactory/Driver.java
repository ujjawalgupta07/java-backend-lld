package DesignPatterns.Factory.DbFactory;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the db :: ");
        String db = sc.nextLine();
        Query q = DatabaseFactory.createQuery(db);
        q.printQuery();
    }
}
