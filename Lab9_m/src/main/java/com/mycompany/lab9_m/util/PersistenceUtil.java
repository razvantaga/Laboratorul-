/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab9_m.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class PersistenceUtil {
    private static PersistenceUtil instance;
    public static Connection connection;
    private String url = "jdbc:postgresql://localhost:1521/jdbc";
    private String username = "STUDENT";
    private String password = "STUDENT";
    
    private PersistenceUtil() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            PersistenceUtil.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }
    
    public PersistenceUtil(String url, String username, String password){
        this.password=password;
        this.url=url;
        this.username=username;
    }
    
    public Connection getConnection() {
        return connection;
    }
     
    public static PersistenceUtil getInstance() throws SQLException {
        if (instance == null) {
            instance = new PersistenceUtil();
        } else if (instance.getConnection().isClosed()) {
            instance = new PersistenceUtil();
        }
        return instance;
    }
}
