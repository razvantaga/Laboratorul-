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
public class AlbumController implements Comparable<Object>{
    private String name;
    private int artistId; 
    private int releaseYear;
    
    AlbumController(){
        name=null;
        artistId=0;
        releaseYear=0;
    }
    
    AlbumController(String name, int artistId, int releaseYear){
        this.artistId=artistId;
        this.name=name;
        this.releaseYear=releaseYear;
    }
    
    public String GetName(){
        return name;
    }
    
    public void setName(String name) {
      this.name = name;
    }
    
    public int getartistId(){
        return artistId; 
    }
    
    public void setArtistId(int artistId) {
      this.artistId = artistId;
    }
    
    public int getreleaseYear(){
        return releaseYear;
    }
    
    public void setYear(int releaseYear) {
      this.releaseYear = releaseYear;
    }
    
    public void Create(String name, int artistId, int releaseYear){
        this.name=name;
        this.artistId=artistId;
        this.releaseYear=releaseYear;
    }
    
    public int findByArtist(int artistId) throws SQLException{
        String sql = "SELECT id FROM artists WHERE id=?";
        PreparedStatement pstmt = Database.con.prepareStatement(sql);
        pstmt.setString(artistId, name);
        pstmt.executeUpdate();
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt("id");  
    }
    
    public int compareTo(Object o) {
        AlbumController a = (AlbumController) o; 
        return this.releaseYear - a.releaseYear ;
    }
}
