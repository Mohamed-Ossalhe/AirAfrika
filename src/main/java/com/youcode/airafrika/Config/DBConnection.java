package com.youcode.airafrika.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    private static Connection conn;
    private static DBConnection instance;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public Connection establishConnection() {
        if (conn == null) {
            String jdbcUrl = "jdbc:postgresql://localhost:5433/easybank";
            String username = "postgres";
            String password = "1999";

            try {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection(jdbcUrl, username, password);

                if (conn != null) {
                    System.out.println("Connection to PostgreSQL database established.");
                }

            } catch (ClassNotFoundException | SQLException e) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, "An Error Occurred", e);
            }
        }
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, "An Error Occurred", e);
            }
        }
    }
}
