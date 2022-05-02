package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

import static runner.RunBase.getDriver;
import static support.Utils.getRandomEmail;

public class CompraPage extends RunCucumberTest {

    private By acessar_tela_login = By.id("search_query_top");
    private By pesquisa_vestido = By.id("search_query_top");
    private By clica_pesquisa = By.id("search_query_top");
    private By seleciona_cor_produto_vestido = By.id("color_37");
    private By seleciona_lista_tamanho = By.id("group_1");
    private By seleciona_tamanho_produto = By.id("group_1");
    private By botao_adiciona_produto_carrinho = By.id("add_to_cart");
    private By botao_continuar_compra = By.className("btn");
    private By pesquisa_short = By.id("search_query_top");
    private By seleciona_cor_produto_short = By.id("color_2");
    private By botao_adiciona_produto_carrinho1 = By.id("add_to_cart");
    private By botao_continuar_compra1 = By.className("btn");
    private By pesquisa_blusa = By.id("search_query_top");
    private By botao_seleciona_cor_blusa = By.id("color_7");
    private By botao_aumenta_quantidade_blusa = By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]");
    private By botao_adiciona_produto_carrinho2 = By.id("add_to_cart");
    private By botao_finalizar_compra = By.className("btn");
   private By botao_verificar_carrinho = By.className("shopping_cart");

    public void acessarTelaLogin() {
        getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        getDriver().manage().window().maximize();
    }
    public void pesquisaPorProdutoVestido() {
        getDriver().findElement(pesquisa_vestido).sendKeys("Printed Chiffon Dress");
        getDriver().findElement(clica_pesquisa).sendKeys(Keys.ENTER);
        Utils.waitElementBePresent(pesquisa_vestido, 20);
    }
    public void selecionaCorProdutoVestido() {
        getDriver().findElement(seleciona_cor_produto_vestido).sendKeys(Keys.ENTER);
    }
    public void selecionaTamanhoProdutoVestido() {
        Select seleciona_tamanho = new Select(getDriver().findElement((seleciona_tamanho_produto)));
        seleciona_tamanho.selectByVisibleText("M");
    }
    public void adicionarProdutoCarrinhoVestido() {
        getDriver().findElement(botao_adiciona_produto_carrinho).click();
    }
    public void continuarCompra() {
        getDriver().findElement(botao_continuar_compra).click();
    }
    public void pesquisaPorProdutoShort() {
        getDriver().findElement(pesquisa_short).sendKeys("Faded Short Sleeve T-shirts");
        getDriver().findElement(clica_pesquisa).sendKeys(Keys.ENTER);
        Utils.waitElementBePresent(pesquisa_short, 20);
    }
    public void selecionaCorProdutoShort() {
        getDriver().findElement(seleciona_cor_produto_short).sendKeys(Keys.ENTER);
    }
    public void adicionarProdutoCarrinhoShort() {
        getDriver().findElement(botao_adiciona_produto_carrinho1).click();
        getDriver().findElement(botao_continuar_compra).click();
    }
    public void continuarCompra1() {
        getDriver().findElement(botao_continuar_compra).click();
    }
    public void pesquisaPorProdutoblusa() {
        getDriver().findElement(pesquisa_blusa).sendKeys("Blouse");
        getDriver().findElement(clica_pesquisa).sendKeys(Keys.ENTER);
        Utils.waitElementBePresent(pesquisa_blusa, 20);
    }
    public void selecionaProdutoCorBlusa() {
        getDriver().findElement(botao_seleciona_cor_blusa).sendKeys(Keys.ENTER);
    }
    public void botaoSelecionaQuantidadeBlusa() {
        getDriver().findElement(botao_aumenta_quantidade_blusa).click();

    }
    public void adicionarProdutoCarrinhoBlusa() {

        getDriver().findElement(botao_adiciona_produto_carrinho2).click();
    }
    public void botaoFinalizarCompra() {
        getDriver().findElement(botao_finalizar_compra).click();
    }
    public void botaoVerificarCarrinho() {
       getDriver().findElement(botao_verificar_carrinho).click();
    }
}


