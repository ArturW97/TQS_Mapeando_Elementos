package Tasks;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Pages.HomePage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class HomeTask {

    private static WebDriver driver;
    private static HomePage homePage;
    private static Waits waits;

    public HomeTask(WebDriver driver) {

        this.driver = driver;
        homePage = new HomePage(this.driver);
        waits = new Waits(this.driver);
    }

    public void acessaPageAutomacaoWeb(){

        homeValidation();
        waits.loadElement(homePage.getStartButton());
        homePage.getStartButton().click();
    }

    private void homeValidation(){

        try{
            Assertions.assertTrue(homePage.getStartButton().isDisplayed());
            Report.extentTest.log(Status.PASS, "PAGINA HOME ACESSADA COM SUCESSO", Screenshot.capture(driver));
        } catch (Exception e){
            Report.extentTest.log(Status.FAIL, "NAO FOI POSSIVEL ACESSAR A PAGINA HOME" + e.getMessage(), Screenshot.capture(driver));
        }
    }
}
