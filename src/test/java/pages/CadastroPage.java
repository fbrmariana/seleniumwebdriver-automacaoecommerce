package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroPage extends RunCucumberTest {
    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender1");
    private By primeiro_nome = By.id("customer_firstname");
    private By segundo_nome = By.id("customer_lastname");
    //private By email_field = By.id("email");
    private By password = By.id("passwd");
    private By dia_nascimento = By.id("days");
    private By mes_nascimento = By.id("months");
    private By ano_nascimento = By.id("years");
    private By endereco = By.id("address1");
    private By endereco_cidade = By.id("city");
    private By endereco_estado = By.id("id_state");
    private By endereco_cep = By.id("postcode");
    private By numero_celular = By.id("phone_mobile");
    private By botao_cadastrar = By.id("submitAccount");

    public void selectTitle(Integer type) {
        Utils.waitElementBePresent(titleF, 20);
        if(type == 1){
           getDriver().findElement((titleM)).click();
        }else if (type == 2){
            getDriver().findElement((titleF)).click();
        }
    }
    public void preencheNome(String nome){
        getDriver().findElement(primeiro_nome).sendKeys(nome);
    }
    public void preencheSobrenome(String sobrenome){

        getDriver().findElement(segundo_nome).sendKeys(sobrenome);
    }
    public void preencheSenha(String pass){
        getDriver().findElement(password).sendKeys(pass);
    }

    public void dataNascimento (Integer dia, Integer mes, String ano){
        Select seleciona_dia_nasc = new Select(getDriver().findElement((dia_nascimento)));
        seleciona_dia_nasc.selectByIndex(dia);

        Select seleciona_mes_nasc = new Select(getDriver().findElement((mes_nascimento)));
        seleciona_mes_nasc.selectByIndex(mes);

        Select seleciona_ano_nasc = new Select(getDriver().findElement((ano_nascimento)));
        seleciona_ano_nasc.selectByValue("1989");
    }
    public void preencheEndereco(String end){
        getDriver().findElement(endereco).sendKeys(end);
    }
    public void preencheCidade(String cidade){
        getDriver().findElement(endereco_cidade).sendKeys(cidade);
    }
    public void preencheEstado(String estado) {
        Select seleciona_estado = new Select(getDriver().findElement((endereco_estado)));
        seleciona_estado.selectByVisibleText("California");
    }
    public void preencheCep(String cep) {
        getDriver().findElement(endereco_cep).sendKeys(cep);
    }
    public void preencheNumeroCelular(String celular) {
        getDriver().findElement(numero_celular).sendKeys(celular);
    }
    public void clicaremRegistrar(){
        getDriver().findElement(botao_cadastrar).click();
    }
    public void validarCadastro(String nome, String sobrenome){
      Utils.waitElementBePresent(By.className("button-search"),20);
        String resultado_atual = getDriver().findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
        Assert.assertEquals(nome + " " + sobrenome, resultado_atual);

    }
}
