/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab8_m;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class ArtistController {
    private String name;
    private String country;
    
    ArtistController(){
        name=null;
        country=null;
    }
    
    ArtistController(String name, String country){
        this.country=country;
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void SetName() {
      this.name = name;
    }
    
    public String getCountry(){
        return country;
    }
    
    public void setCountry(String country) {
      this.country = country;
    }
    
    public void create(String name, String country) throws SQLException{
        String sqlStr = "INSERT INTO artists (id,name,country) VALUES(seq_artists.nextval,?,?)"; 
        PreparedStatement pstmt = Database.con.prepareStatement(sqlStr);
        pstmt.setString(1, name);
        pstmt.setString(2, country);
        pstmt.executeUpdate();
    }
    
    public int FindByName(String name) throws SQLException{
        String sql = "SELECT id FROM artists WHERE name=?";
        PreparedStatement pstmt = Database.con.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.executeUpdate();
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt("id");
    }
}
