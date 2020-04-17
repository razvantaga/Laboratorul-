/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab8_m;

import java.util.List;

/**
 *
 * @author User
 */
public interface ArtistControllerDAO {
    public List<ArtistController> getArtistCrotroller();
    public ArtistController getArtistCrotroller(char name);
    public void updateArtist(ArtistController artist);
    public void deleteArtist(ArtistController artist);
}
