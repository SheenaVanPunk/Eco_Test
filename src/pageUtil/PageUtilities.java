/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pageUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author qa
 */
public class PageUtilities {
    
    public static WebDriver initWebDriver(WebDriver driver){
        System.setProperty("webdriver.chrome.driver", "/Users/qa/Desktop/workspace/chromedriver");
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          return  driver;//moras vratiti driver sa kojim radis jer se on poziva prilikom svake metode
    }
    public static String getRandomText(){
        return "Nevena" + (int)(Math.random() * 1000);
    }
//    
//    public static String getRandomEditedText(){
//        return "IzmenjenNaslov" + (int)(Math.random()*1000);
//    }
    
    public static String getRandomUrl(){
        return "http://Proizvoljantekst" + (int)(Math.random() * 1000) + ".com";
    }
}
