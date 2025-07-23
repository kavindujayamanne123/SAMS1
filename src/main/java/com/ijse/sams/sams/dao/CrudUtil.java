package com.ijse.sams.sams.dao;

import com.ijse.sams.sams.DBConnection.DBConnection;
import com.mysql.cj.MysqlConnection;

import java.sql.Connection;
import java.sql.ResultSet;

public class CrudUtil {
    private static PreparedStatement getStatement(String sql, Object... args) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
        if(args != null){
            for(int i = 0; i < args.length; i++){
                statement.setObject((i+1), args[i]);
            }
        }
        return statement;
    }
    public static boolean executeUpdate(String sql, Object... args) throws Exception{
        return getStatement(sql, args).executeUpdate() > 0;
    }
    public static ResultSet executeQuery(String sql, Object... args) throws Exception{
        return getStatement(sql, args).executeQuery();
}
}
