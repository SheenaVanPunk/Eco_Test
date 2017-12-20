/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photoGalleryPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.Page;

/**
 *
 * @author qa
 */
public class PhotoGalleryPage extends Page{
    public void createNewGallery(WebDriver driver){
        addNewGallery(driver);
        nameGallery(driver);
        describeGallery(driver);
        attachPhoto(driver);
        clickSave(driver);
    }
    
    private void addNewGallery(WebDriver driver){
        clickOnElement(driver, By.className("glyphicon-plus"));
    }
    
    private void nameGallery(WebDriver driver){
        sendTextToTitleField(driver, By.id("title"));
    }
    
    private void describeGallery(WebDriver driver){
        sendTextToField(driver, By.id("description"));
    }    
    
    private void attachPhoto(WebDriver driver){
        sendPhoto(driver, By.name("photo_gallery_leading_photo"), "/Users/qa/Desktop/pevara-slider.jpg");
    }
    
    private void clickSave(WebDriver driver){
        clickOnElement(driver, By.name("new_photoGallery_submit"));
    }
    
    
    
    /////////EDITOVANJE GALERIJE///////////////////
    
    public void editGallery(WebDriver driver){
        clickOnEditButton(driver);
    }
    
    private void clickOnEditButton(WebDriver driver){
        clickOnElement(driver, By.xpath("//*[@id='rows-table']/tbody/tr[last()]/td[5]/div/a[2]/i"));
        nameGallery(driver);
        describeGallery(driver);
        attachPhoto2(driver);
        clickSave(driver);
        
    }
    
   private void attachPhoto2(WebDriver driver){
       sendPhoto(driver, By.id("photo_gallery_leading_photo"), "/Users/qa/Desktop/ext.jpg");
   }
   
   ///////BRISANJE GALERIJE//////////////
   
   public void deleteGallery(WebDriver driver){
       clickOnElement(driver, By.xpath("//*[@id='rows-table']/tbody/tr[last()]/td[5]/div/button[2]/i"));
       clickOnElement(driver, By.cssSelector("#delete-warning-dialog > div > div > div.modal-footer > button.btn.btn-danger"));
   }
            
    
    
}
