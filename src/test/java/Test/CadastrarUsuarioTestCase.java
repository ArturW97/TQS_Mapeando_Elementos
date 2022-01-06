package Test;

import Framework.BaseTest;
import Tasks.FormTask;
import Tasks.HomeTask;
import Tasks.MenuTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CadastrarUsuarioTestCase extends BaseTest {

    private WebDriver driver = this.getDriver();
    private HomeTask homeTask = new HomeTask(driver);
    private MenuTask menuTask = new MenuTask(driver);
    private FormTask formTask = new FormTask(driver);

    @Test
    public void realizarCadastro(){

        homeTask.acessaPageAutomacaoWeb();
        menuTask.acessarFormulario();
        formTask.preencherForm();
    }
}
