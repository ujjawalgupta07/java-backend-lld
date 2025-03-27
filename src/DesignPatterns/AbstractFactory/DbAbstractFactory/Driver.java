package DesignPatterns.AbstractFactory.DbAbstractFactory;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the DB: ");
        String db = sc.nextLine();
        Database database = DbFactory.getDB(db);
        DbFactoryFactory dbFactoryFactory = database.createDbFactoryFactory();
        Query q = dbFactoryFactory.createQuery();
        Transaction t = dbFactoryFactory.createTransaction();

        q.printQuery();
        q.runQuery();

        t.begin();
        t.commit();
        t.close();
    }
}
