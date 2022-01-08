package Tasks;

import Framework.Report.Report;
import Framework.Report.Screenshot;
import Framework.Utils.FakerGeneration;
import Pages.FormPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class FormTask {

    private WebDriver driver;
    private FormPage formPage;
    private FakerGeneration fakerGeneration;

    public FormTask(WebDriver driver){
        this.driver = driver;
        formPage = new FormPage(this.driver);
        fakerGeneration = new FakerGeneration(this.driver);
    }


    public void preencherForm(){

        formPage.getName().sendKeys(fakerGeneration.getFirstName());
        formPage.getLastName().sendKeys(fakerGeneration.getLastName());
        formPage.getEmail().sendKeys(fakerGeneration.getEmail());
        formPage.getAddress().sendKeys(fakerGeneration.getAddress());
        formPage.getUniversity().sendKeys(fakerGeneration.getUniversity());
        formPage.getProfile().sendKeys(fakerGeneration.getProfile());
        formPage.getGender().sendKeys(fakerGeneration.getGender());
        formPage.getAge().sendKeys(fakerGeneration.getAge());
        formPage.getEnviarButton().click();
        validarCriacaoUsuario();
    }

    private void validarCriacaoUsuario(){

        try{
            String text = formPage.getMensagemTitle().getText();
            Assertions.assertEquals("Usuário Criado com sucesso", text);
            Report.extentTest.log(Status.PASS, "USUARIO CADASTRADO COM SUCESSO", Screenshot.capture(driver));
        } catch(Exception e){
            Report.extentTest.log(Status.FAIL, "NAO FOI POSSIVEL CADASTRAR O USUARIO", Screenshot.capture(driver));
        }
    }

}
