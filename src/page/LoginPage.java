/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage extends Page{
//        WebDriver driver = new ChromeDriver();//ovo ide u posebnu metodu jer ti treba da vratis webdriver sa kojim radis zbog toga sto se on koristi u svim ostalim metodama
//        WebDriverWait wait = new WebDriverWait(driver, 10);
    
//   goToSite i logIn su mogle da budu jedna metoda ali ajde 
   
   
   public void logIn(WebDriver driver){  
       driver.get("http://ecotest.school.cubes.rs/admin_session/login");
       
        sendTextToField(driver, By.name("username"), "admin");
        sendTextToField(driver, By.name("password"), "cubesqa");
        clickOnElement(driver, By.className("btn-block"));
   }
}
