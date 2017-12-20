/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPhotoGallery;

import dbConnection.DbConnection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import page.DashboardPage;
import page.LoginPage;
import pageUtil.PageUtilities;
import photoGalleryPage.PhotoGalleryPage;


public class TestPhotoGallery {
    private static LoginPage lp;
    private static DashboardPage dash;
    private static PhotoGalleryPage gallery;
    private static WebDriver driver;
    
    @BeforeClass
    public static void setUpClass() {
        driver = PageUtilities.initWebDriver(driver);
        
        lp = new LoginPage();
        lp.logIn(driver);
        
        DbConnection.getConnection();
    }
    
//    @AfterClass
//    public static void tearDownClass() {
//        driver.quit();
//    }
    
    @Before
    public void setUp() {
        dash = new DashboardPage();
        gallery = dash.clickOnPhotoGallery(driver);
    }
    
    @After
    public void tearDown() {
    }

   
   @Test
    public void testNewPhotoGallery(){
        gallery.createNewGallery(driver);
    
    }
    
    @Test
    public void testEditPhotoGallery(){
        gallery.editGallery(driver);
    }
    
    @Test
    public void testDeletePhotoGallery(){
        gallery.deleteGallery(driver);
    }
}
