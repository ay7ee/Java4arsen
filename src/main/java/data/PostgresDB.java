package data;


import data.interfaces.IDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresDB implements IDB {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String Url = "jdbc:postgresql://localhost:5432/Java";
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(Url, "postgres", "reckless4444");

            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}