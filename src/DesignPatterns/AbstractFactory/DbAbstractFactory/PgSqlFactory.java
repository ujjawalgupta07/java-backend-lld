package DesignPatterns.AbstractFactory.DbAbstractFactory;

public class PgSqlFactory implements DbFactoryFactory{

    @Override
    public Query createQuery() {
        return new SqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new SqlTransaction();
    }
}
