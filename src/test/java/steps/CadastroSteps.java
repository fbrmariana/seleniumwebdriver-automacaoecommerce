package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;


public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();
    String nome = "Mariana";
    String sobrenome = "Leite";

    @Quando("^eu prencho o formulario de cadastro$")
    public void eu_prencho_o_formulario_de_cadastro() {
        cadastroPage.selectTitle(2);
        cadastroPage.preencheNome(nome);
        cadastroPage.preencheSobrenome(sobrenome);
        cadastroPage.preencheSenha("1234@");
        cadastroPage.dataNascimento(05, 8, "1989");
        cadastroPage.preencheEndereco("Rua do Guaruja 72");
        cadastroPage.preencheCidade("California");
        cadastroPage.preencheEstado("California");
        cadastroPage.preencheCep("12345");
        cadastroPage.preencheNumeroCelular("+55011951609222");


    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {
        cadastroPage.clicaremRegistrar();

    }

    @Então("^vejo cadastro realizado com sucesso$")
    public void vejo_cadastro_realizado_com_sucesso() {
        cadastroPage.validarCadastro(nome, sobrenome);

    }


}



