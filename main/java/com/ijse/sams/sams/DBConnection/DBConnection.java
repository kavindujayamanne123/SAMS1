package com.ijse.sams.sams.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private  static DBConnection dbConnection;
    private final java.sql.Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sams","root","jayamanne123mysql");

    }
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
    public java.sql.Connection getConnection(){
        return connection;
    }
}
