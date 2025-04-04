package com.dunwam.jepschemistpos.utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConn {
    public Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("org.sqlite.JDBC");
            connection= DriverManager.getConnection("jdbc:sqlite:src/main/resources/DATABASE/JepsChemist.db");
        }
        catch (SQLException | ClassNotFoundException e){
            System.out.println("Invalid URl");
            throw new RuntimeException(e);
        }
        return connection;
    }
}
