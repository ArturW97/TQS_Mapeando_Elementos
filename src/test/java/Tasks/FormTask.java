package Tasks;

import Pages.FormPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class FormTask {

    private WebDriver driver;
    private FormPage formPage;

    public FormTask(WebDriver driver){

        this.driver = driver;
        formPage = new FormPage(this.driver);
    }


    public void preencherForm(){

        formPage.getName().sendKeys("AAAAA");
        formPage.getLastName().sendKeys("Sobrenome");
        formPage.getEmail().sendKeys("email@email.com");
        formPage.getAddress().sendKeys("Rua do bobo 0");
        formPage.getUniversity().sendKeys("fundatec");
        formPage.getProfile().sendKeys("pro em ti");
        formPage.getGender().sendKeys("A");
        formPage.getAge().sendKeys("99");
        formPage.getEnviarButton().click();

    }

    private void validarCriacaoUsuario(){

        String text = formPage.getMensagemTitle().getText();

        Assertions.assertEquals("Usuário Criar com sucesso", text);
    }

}
