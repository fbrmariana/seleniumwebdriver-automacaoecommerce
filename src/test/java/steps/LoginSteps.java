package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTest;


public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();
    @Dado("^que eu estou na tela de login$")
    public void que_eu_estou_na_tela_de_login() {
        getDriver(RunBase.Browser.CHROME);
        loginPage.acessarTelaLogin();

    }

    @Dado("^acesso o Cadastro de usuario$")
    public void acesso_o_Cadastro_de_usuario()  {
        loginPage.preencherCampoEmail();
        loginPage.clicarCriarContaBotao();

    }
}
