package DesignPatterns.AbstractFactory.DbAbstractFactory;

public interface DbFactoryFactory {

    Query createQuery();
    Transaction createTransaction();
}
