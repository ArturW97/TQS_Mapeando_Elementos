package Tasks;

import Framework.Browser.Waits;
import Pages.MenuPage;
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

        String text = menuPage.getTextTitle().getText();
        Assertions.assertEquals("Lista de Funcionalidades", text);
    }
}
