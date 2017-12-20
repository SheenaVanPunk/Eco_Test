
package indexSliderPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import page.Page;


public class IndexSliderPage extends Page{
    
    public void createNewSlider(WebDriver driver){
      addNewSlider(driver);
      nameSlider(driver);
      describeSlider(driver);
      selectLinkType(driver);
      enterLinkLabel(driver);
      enterRandomUrl(driver);
      attachPhoto(driver);
      clickSave(driver);
    }
    private void addNewSlider(WebDriver driver){
//         clickOnElement(driver, By.className("btn-default"));//lokator ti nije dobar, ima vise klasa sa istim nazivom pa je test kliktao na cancel dugme/
        clickOnElement(driver, By.className("glyphicon-plus"));
    }
    
    private void nameSlider(WebDriver driver){
        sendTextToTitleField(driver, By.name("title"));
    }
    
    private void describeSlider(WebDriver driver){
        sendTextToField(driver, By.id("description"));
    }
    
    private void selectLinkType(WebDriver driver){
        WebElement element = driver.findElement(By.id("link_type"));
        Select s = new Select(element);
        s.selectByIndex(2);
    }
    
    private void enterLinkLabel(WebDriver driver){
        sendTextToField(driver, By.id("link_label"));
    }
    
    private void enterRandomUrl(WebDriver driver){
        sendUrlToField(driver, By.id("internal_link_url"));
    }
    
    private void attachPhoto(WebDriver driver){ //By.id("index_slide_photo")
        sendPhoto(driver, By.id("index_slide_photo"), "/Users/qa/Desktop/663760672_780x439.jpg"); ///Users/qa/Desktop/...
        
    }
    
    private void clickSave(WebDriver driver){
        clickOnElement(driver, By.id("new_indexSlide_submit")); //By.id("new_indexSlide_submit")
    }
    
    
    ///////////// EDITOVANJE POSLEDNJEG SLAJDERA///////////////////
    
    public void editLastSlider(WebDriver driver){
    clickEditButton(driver);
    nameSlider(driver);
    describeSlider(driver);
    selectLinkType2(driver);
    enterLinkLabel(driver);
    enterRandomUrl2(driver);
    attachPhoto2(driver);
    clickSave(driver);
    }
    
    private void clickEditButton(WebDriver driver){
        clickOnElement(driver, By.xpath("//*[@id='rows-table']/tbody/tr[last()]/td[7]/div/a/i"));
    }
    
    private void selectLinkType2(WebDriver driver){
        WebElement element = driver.findElement(By.id("link_type"));
        Select s = new Select(element);
        s.selectByIndex(3);
    }
    
    private void enterRandomUrl2(WebDriver driver){
        sendUrlToField(driver, By.name("external_link_url"));
    }
    
     private void attachPhoto2(WebDriver driver){
        sendPhoto(driver, By.id("index_slide_photo"), "/Users/qa/Desktop//homepageslider-bg.jpg");
    }
    
     ///////////////////BRISANJE POSLEDNJEG SLAJDERA//////////////////////////////
     public void deleteLastSlider(WebDriver driver) {
         clickOnElement(driver, By.xpath("//*[@id='rows-table']/tbody/tr[last()]/td[7]/div/button[2]/i"));
         clickOnElement(driver, By.cssSelector("#delete-warning-dialog > div > div > div.modal-footer > button.btn.btn-danger > i"));
     }
     
     public int getIdFromWeb(WebDriver driver){
     return getIdFromLastRow(driver, "data-index-slide-id");
     }
     
     
}
