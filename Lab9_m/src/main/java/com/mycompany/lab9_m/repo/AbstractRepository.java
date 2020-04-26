/*
 * class AbstractRepository for simplify the album and artist 
 * repository classes
 * 
 */
package com.mycompany.lab9_m.repo;

import com.mycompany.lab9_m.entity.Album;
import com.mycompany.lab9_m.entity.Artist;
import com.mycompany.lab9_m.util.PersistenceUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author User
 */
public interface AbstractRepository{
   void create(String name, String country, String music)throws SQLException;
   int FindByName(String name)throws SQLException;
   
   void Create(String name, int artistId, int releaseYear, String music)throws SQLException;
   int findByArtist(int artistId)throws SQLException;
}
