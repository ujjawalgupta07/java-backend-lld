package DesignPatterns.AbstractFactory.DbAbstractFactory;

public class MySqlFactory implements DbFactoryFactory{

    @Override
    public Query createQuery() {
        return new SqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new SqlTransaction();
    }
}
