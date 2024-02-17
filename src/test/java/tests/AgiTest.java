package tests;

import org.hamcrest.CoreMatchers;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import utils.UtilsWeb;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AgiTest {

    private HomePage homePage = new HomePage();

    @Test
    public void validarPesquisaComSucesso() {

        UtilsWeb.inicializar();

        homePage.clicarLupaPesquisar();
        homePage.digitarTextoPesquisa("Quem é");

        Assert.assertEquals(homePage.getConteudo(), "Cássia Sanz");
    }


    @Test
    public void validarPesquisaSemResultado() {
        homePage.clicarLupaPesquisar();
        homePage.digitarTextoPesquisa("000");
        Assert.assertThat(homePage.getSemResultado(), CoreMatchers.containsString("Lamentamos, mas nada foi encontrado para sua pesquisa, tente novamente com outras palavras."));
    }

}
