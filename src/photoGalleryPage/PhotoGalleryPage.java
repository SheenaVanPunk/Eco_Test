/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photoGalleryPage;


import domen.PhotoGallery;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.Page;

/**
 *
 * @author qa
 */
public class PhotoGalleryPage extends Page{
    public PhotoGallery createNewGallery(WebDriver driver){
        PhotoGallery pg = new PhotoGallery();
        addNewGallery(driver);
        
        String enteredTitle = nameGallery(driver);
        pg.setTitle(enteredTitle);
//        pg.setTitle(nameGallery(driver));
        
        //describeGallery(driver);
        String desc = describeGallery(driver);
        pg.setDescription(desc);
        
        attachPhoto(driver);
        
        clickSave(driver);
        pg.setId(getIdFromWeb(driver));
        
        return pg;
    }
    
    private void addNewGallery(WebDriver driver){
        clickOnElement(driver, By.className("glyphicon-plus"));
    }
    
    private String nameGallery(WebDriver driver){
        return sendTextToTitleField(driver, By.id("title"));
    }
    
    private String describeGallery(WebDriver driver){
        return sendTextToField(driver, By.id("description"));
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
     public int getIdFromWeb(WebDriver driver){
     return getIdFromLastRow(driver, "data-photo-gallery-id");
     }
    
    
}
