package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement startButton(){
        return this.driver.findElement(By.xpath("//div[@class='row col s12']/div[@class='col s6']/div[@id='index-banner']/div/div/a"));
    }
}
