package steps;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeuBarrigaTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Inicializar o driver do Chrome
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testSeuBarriga() {
        // Dado que o usuário está na página de login
        driver.get("https://seubarriga.wcaquino.me/login");

        // Quando ele cadastra um novo usuário
        WebElement novoUsuarioLink = driver.findElement(By.linkText("Novo Usuário?"));
        novoUsuarioLink.click();
        // Preencher os campos de cadastro e enviar o formulário

        // Quando ele efetua login
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement senhaInput = driver.findElement(By.id("senha"));
        WebElement entrarButton = driver.findElement(By.tagName("button"));
        emailInput.sendKeys("seu-email");
        senhaInput.sendKeys("sua-senha");
        entrarButton.click();

        // Quando ele cadastra uma nova conta
        WebElement contasLink = driver.findElement(By.linkText("Contas"));
        contasLink.click();
        // Preencher os campos de cadastro e enviar o formulário

        // Quando ele inclui uma nova movimentação financeira
        WebElement movimentacaoLink = driver.findElement(By.linkText("Movimentação"));
        movimentacaoLink.click();
        // Preencher os campos de cadastro e enviar o formulário

        // Quando ele confirma o cadastro da movimentação
        WebElement dataPagamentoInput = driver.findElement(By.id("data_pagamento"));
        dataPagamentoInput.sendKeys("data-desejada");
        WebElement pesquisarButton = driver.findElement(By.xpath("//input[@value='Pesquisar']"));
        pesquisarButton.click();
        // Verificar se a movimentação cadastrada aparece na tabela de resultados

        // Quando ele exclui a movimentação financeira
        WebElement excluirButton = driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]/a"));
        excluirButton.click();
        // Confirmar a exclusão

        // Quando ele exclui a conta cadastrada
        WebElement excluirContaButton = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/a"));
        excluirContaButton.click();
        // Confirmar a exclusão

        // Quando ele volta à tela inicial e clica em "reset"
        WebElement homeLink = driver.findElement(By.linkText("Home"));
        homeLink.click();
        WebElement resetButton = driver.findElement(By.xpath("//input[@value='Reset']"));
        resetButton.click();

        // Quando ele efetua logout
        WebElement logoutLink = driver.findElement(By.linkText("Sair"));
        logoutLink.click();

        // Então ele deve ser redirecionado para a página de login
        Assert.assertEquals("https://seubarriga.wcaquino.me/login", driver.getCurrentUrl());
    }

    @After
    public void tearDown() {
        // Fechar o browser
        driver.quit();
    }
}
