/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab9_m.app;

import com.mycompany.lab9_m.entity.Album;
import com.mycompany.lab9_m.entity.Artist;
import com.mycompany.lab9_m.repo.AbstractRepository;
import com.mycompany.lab9_m.repo.AlbumRepository;
import com.mycompany.lab9_m.repo.ArtistRepository;
import com.mycompany.lab9_m.util.PersistenceUtil;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author User
 */
public class AlbumManager {
    public static void main(String[] args) throws SQLException {
        PersistenceUtil util=new PersistenceUtil("jdbc:postgresql://localhost:1521/jdbc", "dba", "sql");
        
        //create artists in datebase table
        ArtistRepository artist= new ArtistRepository();
        artist.create("Mike", "England", "POP");
        artist.create("Jhonas", "America", "POP");
        artist.create("Nicolas", "Italy", "HIP-HOP");
        System.out.println(artist); 
        artist.FindByName("Mike");
        
        //create album in datebase table
        AlbumRepository album = new AlbumRepository();
        album.Create("Mike", 10, 2000, "POP");
        album.Create("Jhonas", 20, 2001, "POP");
        album.Create("Nicolas", 30, 2002, "HIP-HOP");
        System.out.println(album); 
        album.findByArtist(10);
        
        //create a artist list 
        List<Artist> Artists = new ArrayList<>();
        Artist artist1= new Artist("Michael", "England", "Pop");
        Artists.add(artist1);
        Artist artist2= new Artist("Mike", "France", "Pop");
        Artists.add(artist2);
        Artist artist3= new Artist("Michael", "America", "Rock");
        Artists.add(artist3);
        Collections.sort(Artists); //sort the list by music
        System.out.println("List after the use of" + " Collection.sort() :\n" + Artists);
        
        //create a album list
        List<Album> Albums = new ArrayList<>();
        Album album1 = new Album("Album1", 11, 1999, "POP");
        Albums.add(album1);
        Album album2 = new Album("Album2", 11, 1998, "POP");
        Albums.add(album2);
        Album album3 = new Album("Album3", 11, 2000, "ROCK");
        Albums.add(album3);
        Collections.sort(Albums); //sort the list by music
        System.out.println("List after the use of" + " Collection.sort() :\n" + Albums);
        
        
        //create an artist using AbstractRepository
        
        
    }
}
