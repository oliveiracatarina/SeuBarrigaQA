package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MovimentacaoPage {
    private final WebDriver driver;
    private final By movimentacaoLink = By.linkText("Movimentação");
    private final By dataPagamentoInput = By.id("data_pagamento");
    private final By pesquisarButton = By.xpath("//input[@value='Pesquisar']");
    private final By excluirButton = By.xpath("//table/tbody/tr[1]/td[6]/a");

    public MovimentacaoPage (WebDriver driver){
        this.driver = driver;
    }

    public void acessarPagina() {
        WebElement movimentacaoLinkField = driver.findElement(movimentacaoLink);
        movimentacaoLinkField.click();
    }

    public void cadastrarMovimentacao(){
        //preencher os campos e enviar formulario
    }

    public boolean verificarMovimentacao(String dataPagamento){
        WebElement dataPagamentoInputField = driver.findElement(dataPagamentoInput);
        WebElement pesquisarButtonField = driver.findElement(pesquisarButton);

        dataPagamentoInputField.sendKeys(dataPagamento);
        pesquisarButtonField.click();

        //verificar se a movimentação cadastrada aparece na tabela de resultados
        return false;
    }

    public void excluirMovimentacao(){
        WebElement excluirButtonField = driver.findElement(excluirButton);
    }
}
