package DesignPatterns.AbstractFactory.DbAbstractFactory;

public class MongoFactory implements DbFactoryFactory{

    @Override
    public Query createQuery() {
        return new NoSqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new NoSqlTransaction();
    }
}
