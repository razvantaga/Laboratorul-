/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab9_m.repo;

import com.mycompany.lab9_m.util.PersistenceUtil;
import com.mycompany.lab9_m.entity.Artist;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class ArtistRepository {
    private Artist art;
    
    public void create(String name, String country, String music) throws SQLException{
        String sqlStr = "INSERT INTO artists (id,name, country, music) VALUES(seq_artists.nextval,?,?)"; 
        PreparedStatement pstmt = PersistenceUtil.connection.prepareStatement(sqlStr);
        pstmt.setString(1, name);
        pstmt.setString(2, country);
        pstmt.executeUpdate();
    }
    
    public int FindByName(String name) throws SQLException{
        String sql = "SELECT id FROM artists WHERE name=?";
        PreparedStatement pstmt = PersistenceUtil.connection.prepareStatement(sql);
        pstmt.setString(1, art.getName());
        pstmt.executeUpdate();
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt("id");
    }
    
}

