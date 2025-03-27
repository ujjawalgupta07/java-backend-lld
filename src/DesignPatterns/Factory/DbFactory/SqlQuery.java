package DesignPatterns.Factory.DbFactory;

public class SqlQuery implements Query {

    @Override
    public void printQuery() {
        System.out.println("Running Sql Query");
    }
}
