package DesignPatterns.AbstractFactory.DbAbstractFactory;

public class PgSqlDb extends Database{

    @Override
    DbFactoryFactory createDbFactoryFactory() {
        return new PgSqlFactory();
    }
}
