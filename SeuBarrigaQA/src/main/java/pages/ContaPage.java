package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContaPage {

    private final WebDriver driver;
    private final By contasLink = By.linkText("Contas");

    public ContaPage (WebDriver driver) {
        this.driver = driver;
    }

    public void acessarPagina() {
        WebElement contasLinkField = driver.findElement(contasLink);
        contasLinkField.click();
    }

    public void cadastrarConta(String nomeConta) {
        //Preencher os campos e enviar formulario
    }
}
