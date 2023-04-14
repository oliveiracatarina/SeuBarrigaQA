package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    private final By homelink = By.linkText("Home");
    private final By resetButton = By.xpath("//input[@value='Reset']");
    private final By logoutLink = By.linkText("Sair");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
}
