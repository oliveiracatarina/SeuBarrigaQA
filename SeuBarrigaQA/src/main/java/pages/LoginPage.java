package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private final WebDriver driver;
    private final By emailInput = By.id("email");
    private final By senhaInput = By.id("senha");
    private final By entrarButton = By.tagName("button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void preencherFormulario(String email, String senha){
        WebElement emailInputField = driver.findElement(emailInput);
        WebElement senhaInputField = driver.findElement(senhaInput);
        WebElement entrarButtonField = driver.findElement(entrarButton);

        emailInputField.sendKeys(email);
        senhaInputField.sendKeys(senha);
        entrarButtonField.click();
    }

}
