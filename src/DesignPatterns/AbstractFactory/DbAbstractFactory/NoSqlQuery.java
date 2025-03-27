package DesignPatterns.AbstractFactory.DbAbstractFactory;

public class NoSqlQuery implements Query {


    @Override
    public void printQuery() {
        System.out.println("Printing NoSql Query");
    }

    @Override
    public void runQuery() {
        System.out.println("Running NoSql Query");
    }
}
