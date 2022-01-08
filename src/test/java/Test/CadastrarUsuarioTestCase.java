package Test;

import Framework.BaseTest;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Tasks.FormTask;
import Tasks.HomeTask;
import Tasks.MenuTask;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CadastrarUsuarioTestCase extends BaseTest {

    private WebDriver driver = this.getDriver();
    private HomeTask homeTask = new HomeTask(driver);
    private MenuTask menuTask = new MenuTask(driver);
    private FormTask formTask = new FormTask(driver);

    @Test
    public void realizarCadastro(){

        try{
            Report.startReport("Realizar Cadastro de Usuário");
            homeTask.acessaPageAutomacaoWeb();
            menuTask.acessarFormulario();
            formTask.preencherForm();
        } catch (Exception e){
            Report.extentTest.log(Status.FAIL, e.getMessage(), Screenshot.base64(driver));
        }
        }


}
