package DesignPatterns.AbstractFactory.DbAbstractFactory;

public class MongoDb extends Database{
    @Override
    DbFactoryFactory createDbFactoryFactory() {
        return new MongoFactory();
    }
}
