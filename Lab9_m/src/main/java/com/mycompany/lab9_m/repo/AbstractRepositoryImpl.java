/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab9_m.repo;

import com.mycompany.lab9_m.entity.Album;
import com.mycompany.lab9_m.entity.Artist;
import com.mycompany.lab9_m.util.PersistenceUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public abstract class AbstractRepositoryImpl implements AbstractRepository{
    private Artist artist;
    private Album album;
    @Override
    public void create(String name, String country, String music) throws SQLException{
        String sqlStr = "INSERT INTO artists (id,name, country, music) VALUES(seq_artists.nextval,?,?)"; 
        PreparedStatement pstmt = PersistenceUtil.connection.prepareStatement(sqlStr);
        pstmt.setString(1, name);
        pstmt.setString(2, country);
        pstmt.executeUpdate();
    }

    
    @Override
    public int FindByName(String name) throws SQLException{
        String sql = "SELECT id FROM artists WHERE name=?";
        PreparedStatement pstmt = PersistenceUtil.connection.prepareStatement(sql);
        pstmt.setString(1, artist.getName());
        pstmt.executeUpdate();
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt("id");
    }
    
    @Override
    public void Create(String name, int artistId, int releaseYear, String music) throws SQLException{
        String sqlStr = "INSERT INTO artists (id,name,country, music) VALUES(seq_artists.nextval,?,?)"; 
        PreparedStatement pstmt = PersistenceUtil.connection.prepareStatement(sqlStr);
        pstmt.setString(1, name);
        pstmt.setString(2, name);
        pstmt.executeUpdate();
    }


    @Override
    public int findByArtist(int artistId) throws SQLException{
        String sql = "SELECT id FROM artists WHERE id=?";
        PreparedStatement pstmt = PersistenceUtil.connection.prepareStatement(sql);
        pstmt.setString(artistId, album.GetName());
        pstmt.executeUpdate();
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt("id");
    }
    
}
