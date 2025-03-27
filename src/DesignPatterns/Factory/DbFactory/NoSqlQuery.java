package DesignPatterns.Factory.DbFactory;

public class NoSqlQuery implements Query {

    @Override
    public void printQuery() {
        System.out.println("Running NoSql Query");
    }
}
