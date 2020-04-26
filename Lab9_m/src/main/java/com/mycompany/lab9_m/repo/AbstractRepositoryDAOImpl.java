/*
 * A little implementaion for AbstractRepository DAO class 
 * 
 * 
 */
package com.mycompany.lab9_m.repo;

import com.mycompany.lab9_m.entity.Album;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public abstract class AbstractRepositoryDAOImpl implements AbstractRepositoryDAO{
    
    List<ArtistRepository> artists;
    List<AlbumRepository> albums;
    
    public AbstractRepositoryDAOImpl(){
      artists = new ArrayList<ArtistRepository>();
      ArtistRepository Artist1 = new ArtistRepository();
      ArtistRepository Artist2 = new ArtistRepository();
      artists.add(Artist1);
      artists.add(Artist2);
      
      albums = new ArrayList<AlbumRepository>();
      AlbumRepository Album1 = new AlbumRepository();
      AlbumRepository Album2 = new AlbumRepository();
      albums.add(Album1);
      albums.add(Album2);
    }
    
    @Override
    public void deleteArtist(ArtistRepository artist) {
      artists.remove(artist);
      System.out.println("Artist: Name " + artist + ", deleted from database");
    }

   //retrive list of students from the database
    @Override
    public List<ArtistRepository> getArtistRepository() {
        return artists;
    }

    @Override
    public ArtistRepository getArtistCrotroller(char name) {
       return artists.get(name);
    }
    

    
    @Override
    public void deleteAlbum(AlbumRepository album) {
        albums.remove(album);
        System.out.println("Album: ArtistId No " + album + ", deleted from database");
    }
    
    //retrive list of albums from the database
    public List<AlbumRepository> getAllAlbumRepository() {
        return albums;
    }

    @Override
    public AlbumRepository getArtistAbstract(int artistId) {
        return albums.get(artistId);
    }
}
