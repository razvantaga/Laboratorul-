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
public class Artist implements Comparable{
    private String name;
    private String country;
    private String music; //add suport for charts
    
    public Artist(){
        name=null;
        country=null;
        music=null;
    }
    
    public Artist(String name, String country, String music){
        this.country=country;
        this.name=name;
        this.music=music;
    }
    
    public String getMusic(){
        return music;
    }
    
    public void SetMusic(){
        this.music=music;
    }
    
    public String getName(){
        return name;
    }
    
    public void SetName(String name) {
      this.name = name;
    }
    
    public String getCountry(){
        return country;
    }
    
    public void setCountry(String country) {
      this.country = country;
    }
    
    public int compareTo(Object o) {
         return this.getMusic().compareTo(((Artist) o).getMusic());
    }
}
