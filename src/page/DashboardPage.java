
package page;

import indexSliderPage.IndexSliderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import photoGalleryPage.PhotoGalleryPage;


public class DashboardPage extends Page{
    
    public IndexSliderPage clickOnIndexSlider(WebDriver driver){
        
        clickOnElement(driver, By.linkText("Index Slider"));
        return PageFactory.initElements(driver, IndexSliderPage.class);
    }
    
    public PhotoGalleryPage clickOnPhotoGallery(WebDriver driver){
        clickOnElement(driver, By.cssSelector("#side-menu > li:nth-child(3) > a")); 
        return PageFactory.initElements(driver, PhotoGalleryPage.class); //vraca objekat klase DashboardPage i zato nema potrebe inicijalizovati DP u test klasi
    }

    


}
