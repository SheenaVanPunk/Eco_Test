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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author qa
 */
public class DbConnection {

    private static Connection conn;

    public static void getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            conn = DriverManager.getConnection("jdbc:mysql://136.243.5.37:33063/brzevesti_test", "root", "cubesqa");
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static PhotoGallery getPhotoGalleryPage(String query) throws SQLException {
        PhotoGallery pg = new PhotoGallery();
        try {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            System.out.println(query);

            while (rs.next()) {
               pg.setId(rs.getInt("data-photo-gallery-id"));
               pg.setTitle(rs.getInt(2));
               pg.setDescription(rs.getInt(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pg;
    }

    public static IndexSlider getIndexSliderPage(String query) {
        IndexSlider is = new IndexSlider();
        try {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            System.out.println(query);

            while (rs.next()) {
//                c.setId(rs.getInt("category_id"));
//                c.setTitle(rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return is;
    }

    public static void close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
