/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnection;

import domen.IndexSlider;
import domen.PhotoGallery;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author qa
 */
public class DbConnection {
    private static Connection conn;
    
    public static void getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            conn = DriverManager.getConnection("jdbc:mysql://136.243.5.37:33063/brzevesti_test", "root", "cubesqa");
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
     public static PhotoGallery getPhotoGalleryPage(){
        return null;
     }  
     
     public static IndexSlider getIndexSliderPage(){
        return null;
     
    }
    
}
