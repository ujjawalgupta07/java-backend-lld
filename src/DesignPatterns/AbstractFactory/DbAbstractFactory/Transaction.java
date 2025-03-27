package DesignPatterns.AbstractFactory.DbAbstractFactory;

public interface Transaction {

    void begin();
    void commit();
    void close();
}
