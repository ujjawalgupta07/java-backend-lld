package DesignPatterns.AbstractFactory.DbAbstractFactory;

public class SqlTransaction implements Transaction {
    @Override
    public void begin() {
        System.out.println("Beginning SQL Transaction");
    }

    @Override
    public void commit() {
        System.out.println("Committing SQL Transaction");

    }

    @Override
    public void close() {
        System.out.println("Closing SQL Transaction");

    }
}
