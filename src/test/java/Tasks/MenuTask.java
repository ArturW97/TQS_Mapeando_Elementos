package Tasks;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Pages.MenuPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class MenuTask {

    private WebDriver driver;
    private MenuPage menuPage;

    public MenuTask(WebDriver driver){

        this.driver = driver;
        menuPage = new MenuPage(this.driver);
    }

    public void acessarFormulario(){

        validaPaginaForm();
        menuPage.getFormLink().click();
        menuPage.getCriarUsuarioLink().click();
    }

    private void validaPaginaForm(){

        try{
            String text = menuPage.getTextTitle().getText();
            Assertions.assertEquals("Lista de Funcionalidades", text);
            Report.extentTest.log(Status.PASS, "PAGINA DE ACESSO AO FORM CARREGADA COM SUCESSO", Screenshot.base64(driver));
        } catch(Exception e){
            Report.extentTest.log(Status.FAIL, e.getMessage(), Screenshot.base64(driver));
        }
    }
}
