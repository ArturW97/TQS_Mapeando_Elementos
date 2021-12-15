package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {

    private WebDriver driver;

    public FormPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getName(){
        return driver.findElement(By.id("user_name"));
    }
    public WebElement getLastName(){
        return driver.findElement(By.id("user_lastname"));
    }
    public WebElement getEmail(){
        return driver.findElement(By.id("user_email"));
    }
    public WebElement getAddress(){
        return driver.findElement(By.id("user_address"));
    }
    public WebElement getUniversity(){
        return driver.findElement(By.id("user_university"));
    }
    public WebElement getProfile(){
        return driver.findElement(By.id("user_profile"));
    }
    public WebElement getGender(){
        return driver.findElement(By.id("user_gender"));
    }
    public WebElement getAge(){
        return driver.findElement(By.id("user_age"));
    }
    public WebElement getEnviarButton(){
        return this.driver.findElement(By.name("commit"));
    }
    public WebElement getMensagemTitle(){
        return this.driver.findElement(By.id("notice"));
    }
}