package DesignPatterns.AbstractFactory.DbAbstractFactory;

public class DbFactory {

    public static Database getDB(String db) {
        return switch (db) {
            case "mongodb" -> new MongoDb();
            case "mysql" -> new MySqlDb();
            case "postgres" -> new PgSqlDb();
            default -> null;
        };
    }

}
