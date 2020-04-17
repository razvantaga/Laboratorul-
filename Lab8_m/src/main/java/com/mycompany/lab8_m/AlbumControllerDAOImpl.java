/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab8_m;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public abstract class AlbumControllerDAOImpl implements AlbumControllerDAO{
    //list is working as a database
    List<AlbumController> albums;
    
    public AlbumControllerDAOImpl(){
      albums = new ArrayList<AlbumController>();
      AlbumController Album1 = new AlbumController("Rock",20, 2000);
      AlbumController Album2 = new AlbumController("Pop",10, 1999);
      albums.add(Album1);
      albums.add(Album2);		
   }
   
   public void deleteAlbum(AlbumController album) {
      albums.remove(album.getartistId());
      System.out.println("Album: ArtistId No " + album.getartistId() + ", deleted from database");
   }

   //retrive list of students from the database
   public List<AlbumController> getAllAlbumController() {
      return albums;
   }

   public AlbumController getAlbumController(int artistId) {
      return albums.get(artistId);
   }

   public void updateAlbum(AlbumController album) {
      albums.get(album.getartistId()).setName(album.GetName());
      System.out.println("Album: Artist ID " + album.getartistId() + ", updated in the database");
   }
}

