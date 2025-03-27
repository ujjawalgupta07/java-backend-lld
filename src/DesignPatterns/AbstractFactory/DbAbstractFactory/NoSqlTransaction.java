package DesignPatterns.AbstractFactory.DbAbstractFactory;

public class NoSqlTransaction implements Transaction {
    @Override
    public void begin() {
        System.out.println("Beginning NoSQL Transaction");
    }

    @Override
    public void commit() {
        System.out.println("Committing NoSQL Transaction");

    }

    @Override
    public void close() {
        System.out.println("Closing NoSQL Transaction");

    }
}
