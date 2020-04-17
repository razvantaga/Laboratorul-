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
public interface AlbumControllerDAO {
    public List<AlbumController> getAlbumCrotroller();
    public AlbumController getAlbumCrotroller(int artistId);
    public void updateAlbum(AlbumController album);
    public void deleteAlbum(AlbumController album);
}
