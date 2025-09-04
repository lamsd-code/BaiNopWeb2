package util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConn {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/web";
    private static final String USER = "root";
    private static final String PASS = "Lammaisd910!";

    public static Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
