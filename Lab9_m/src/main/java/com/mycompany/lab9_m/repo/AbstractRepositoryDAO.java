/*
 * AbstractRepoisotory DAO class
 * 
 * 
 */
package com.mycompany.lab9_m.repo;

import java.util.List;
/**
 *
 * @author User
 */
public interface AbstractRepositoryDAO {
    
    public List<ArtistRepository> getArtistRepository();
    public ArtistRepository getArtistCrotroller(char name);
    public void deleteArtist(ArtistRepository artist);
    
    
    public List<AlbumRepository> getAlbumRepository();
    public AlbumRepository getArtistAbstract(int artistId);
    public void deleteAlbum(AlbumRepository album);
    
}
