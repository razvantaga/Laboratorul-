/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab8_m;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections; 

/**
 *
 * @author User
 */
public class AlbumSort {
    ArrayList<AlbumController> album;
    
    public AlbumSort(){
        album = new ArrayList<AlbumController>();
        
        AlbumController Album1 = new AlbumController("Rock", 32, 2010);
        AlbumController Album2 = new AlbumController("Pop", 12, 1998);
        AlbumController Album3 = new AlbumController("Disco", 22, 1978);
        
        album.add(Album1);
        album.add(Album2);
        album.add(Album3);
        
        Collections.sort(album);
        System.out.println("List after the use of" +  " Collection.sort() :\n" + album);
        
        System.out.println("\nSorted by year");
        for (int i=0; i<album.size(); i++) 
            System.out.println(album.get(i));
        Collections.sort(album, new Sortbyroll());
    }
}

class Sortbyroll implements Comparator<AlbumController> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(AlbumController a, AlbumController b) 
    { 
        return a.getreleaseYear() - b.getreleaseYear(); 
    } 
} 
