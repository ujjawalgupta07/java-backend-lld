package DesignPatterns.AbstractFactory.DbAbstractFactory;

public class MySqlDb extends Database{
    @Override
    DbFactoryFactory createDbFactoryFactory() {
        return new MySqlFactory();
    }
}
