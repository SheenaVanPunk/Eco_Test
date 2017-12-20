/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testSlider;

import indexSliderPage.IndexSliderPage;
import page.LoginPage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.DashboardPage;
import pageUtil.PageUtilities;


public class TestIndexSlider {
    private static LoginPage lp;
    private static DashboardPage dash;
    private static WebDriver driver;
    private static IndexSliderPage slider;
    
    
    
//    prvo treba ti jedna metoda koja ce ti inicijalizovati webdriver sa kojim radis (mozes je staviti u bilo koju klasu ja sam je npr dodao u PageUtilities)
    
    @BeforeClass
    public static void setUpClass() {
        driver = PageUtilities.initWebDriver(driver);
//        driver = new ChromeDriver();//driver si vec inicijalizovala u LoginPage klasi zbog toga su ti se otvarala 2 prozora prilikom pustanja skripte...
      
      
        lp = new LoginPage();
     
        lp.logIn(driver);
    }
    
    @AfterClass
    public static void tearDownClass() {
        driver.quit();
    }
    
    @Before
    public void setUp() {
        dash = new DashboardPage();
        slider = dash.clickOnIndexSlider(driver);
        
    }
    
    @After
    public void tearDown() {
    }
    
//ne treba ti wait kao parametar u metodama jer mi vec imamo metode u klasi Page koja nam kreira wait sa kojim radimo (waitForElementVisibility i waitForElementClickability)
    @Test
    public void testCreateNewSlider(){
        slider.createNewSlider(driver);
    }
    
   @Test
    public void testEditSlider(){
        slider.editLastSlider(driver);
    
}  
  @Test
    public void testDeleteSlider(){
        
        slider.deleteLastSlider(driver);
  }
   
    
    
}
    
    
    
    
    
    
    
    

