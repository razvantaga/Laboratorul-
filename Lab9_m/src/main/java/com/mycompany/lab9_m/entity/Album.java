/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab9_m.entity;

/**
 *
 * @author User
 */
public class Album implements Comparable{
    private String name;
    private int artistId; 
    private int releaseYear;
    private String music; //add suport for charts 
    
    public Album(){
        name=null;
        artistId=0;
        releaseYear=0;
        music=null;
    }
    
    public Album(String name, int artistId, int releaseYear, String music){
        this.artistId=artistId;
        this.name=name;
        this.releaseYear=releaseYear;
        this.music=music;
    }

    public Album(String rock, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String GetMusic(){
        return music;
    }
    
    public void setMusic(String music){
        this.music=music;
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
    
    public int compareTo(Object o) {
        return this.GetMusic().compareTo(((Album) o).GetMusic());
    }
    
}
