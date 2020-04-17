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
public abstract class ArtistControllerDAOImpl implements ArtistControllerDAO{
    //list is working as a database
    List<ArtistController> artists;
    
    public ArtistControllerDAOImpl(){
      artists = new ArrayList<ArtistController>();
      ArtistController Artist1 = new ArtistController("Albert", "Germany");
      ArtistController Artist2 = new ArtistController("Christian", "England");
      artists.add(Artist1);
      artists.add(Artist2);		
    }
    
    public void deleteArtist(ArtistController artist) {
      artists.remove(artist.getName());
      System.out.println("Artist: Name " + artist.getName() + ", deleted from database");
   }

   //retrive list of students from the database
   public List<ArtistController> getArtistController() {
        return artists;
   }

   public ArtistController getArtistController(char name) {
       return artists.get(name);
   }

   public void updateArtist(ArtistController artist) {
      artists.set(1, artist);
      System.out.println("Artist: Artist Name " + artist.getName() + ", updated in the database");
   }
}
