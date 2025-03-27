package DesignPatterns.AbstractFactory.DbAbstractFactory;

public class SqlQuery implements Query {

    @Override
    public void printQuery() {
        System.out.println("Printing Sql Query");
    }

    @Override
    public void runQuery() {
        System.out.println("Running Sql Query");
    }
}
