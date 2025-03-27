package DesignPatterns.Factory.DbFactory;

public class DatabaseFactory {

    public static Query createQuery(String db) {
        return switch (db) {
            case "mongodb" -> new NoSqlQuery();
            case "mysql", "postgresql" -> new SqlQuery();
            default -> null;
        };
    }
}
