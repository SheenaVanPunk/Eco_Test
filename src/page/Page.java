/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageUtil.PageUtilities;

/**
 *
 * @author qa
 */
public class Page {
    
        private WebElement waitForElementVisibility(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element;
    }
    
    private WebElement waitForElementClickability(WebDriver driver, By locator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        return element;
    }
    
    public void clickOnElement(WebDriver driver, By locator){
     
        WebElement element = waitForElementClickability(driver, locator);
        element.click();
    }
    
    public void sendTextToField(WebDriver driver, By locator, String text){ // unosi kredencijale
        WebElement element = waitForElementVisibility(driver, locator);
        element.clear();
        element.sendKeys(text);         
    }
    public String sendTextToField(WebDriver driver, By locator){ //unosi proizvoljan tekst u polja
        WebElement element = waitForElementVisibility(driver, locator);
        element.clear();
        String text = PageUtilities.getRandomText();
        element.sendKeys(text);
        return text;
    }
    
    public String sendTextToTitleField(WebDriver driver, By locator){ // unosi proizvoljan tekst kao naslov
        WebElement element = waitForElementVisibility(driver, locator);
        element.clear();
        String text = PageUtilities.getRandomText();
        element.sendKeys(text);
        return text;
    }
    
    public String sendUrlToField(WebDriver driver, By locator){
        WebElement element = waitForElementVisibility(driver, locator);
        element.clear();
        String text = PageUtilities.getRandomUrl();
        element.sendKeys(text);
        return text;
    }
    
    public void sendPhoto(WebDriver driver, By locator, String photoPath){
        WebElement element = waitForElementClickability(driver, locator);
        element.sendKeys(photoPath);
    }
    
//    public WebElement findLastRow(WebDriver driver){
//        WebElement table = driver.findElement(By.className("rows-table"));
//        List<WebElement> rows = table.findElements(By.tagName("tr"));
//        WebElement lastRow = rows.get(rows.size()-1);
//        return lastRow;
    
    public int getIdFromLastRow(WebDriver driver, String attributeName){
    WebElement table = driver.findElement(By.id("rows-table"));
    List<WebElement> rows = table.findElements(By.tagName("tr"));
    WebElement lastRow = rows.get(rows.size()-1);
    String id = lastRow.getAttribute(attributeName);
    return Integer.valueOf(id);
}
    
    
}
