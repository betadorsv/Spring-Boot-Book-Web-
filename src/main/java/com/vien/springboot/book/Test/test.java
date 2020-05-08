package com.vien.springboot.book.Test;
        import java.sql.Connection;
        import java.sql.DriverManager;

public class test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String databaseURL = "jdbc:sqlserver://localhost:1433;database=BookWebsite";
        String user = "sa";
        String password = "123456";

        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(databaseURL, user, password);
            if (conn != null) {
                System.out.println("Connected to the database");
            }

            System.out.println(conn.getSchema());

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
