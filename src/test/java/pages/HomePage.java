package pages;

import org.junit.FixMethodOrder;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.UtilsWait;
import webdriver.Driver;

import java.util.List;

public class HomePage {

    @FindBy(xpath = "//a[@aria-label='Link do ícone de pesquisa']")
    private WebElement lupaPesquisar;

    @FindBy(name = "s")
    private WebElement inputTexto;

    @FindBy(className = "author-name")
    private WebElement conteudoPesquisaCorreta;

    @FindBy(xpath = "//section[@class='no-results not-found']")
    private WebElement semResultados;


    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clicarLupaPesquisar() {
        UtilsWait.waitPresenceOfElement(lupaPesquisar,60);
        lupaPesquisar.click();
    }

    public void digitarTextoPesquisa(String valor) {
        inputTexto.sendKeys(valor);
        inputTexto.sendKeys(Keys.ENTER);
    }

    public String getConteudo() {
        UtilsWait.waitPresenceOfElement(conteudoPesquisaCorreta, 50);
        return conteudoPesquisaCorreta.getText();
    }

    public String getSemResultado(){
        UtilsWait.waitPresenceOfElement(semResultados, 50);
        return semResultados.getText();
    }


}
