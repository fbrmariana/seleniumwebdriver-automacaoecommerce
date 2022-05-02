package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import pages.CompraPage;
import runner.RunBase;
import runner.RunCucumberTest;

public class CompraSteps extends RunCucumberTest {
    CompraPage compraPage = new CompraPage();

    @Dado("^que eu estou logada no site automationpractice\\.com$")
    public void que_eu_estou_logada_no_site_automationpractice_com() {
        getDriver(RunBase.Browser.CHROME);
        compraPage.acessarTelaLogin();
    }
    @Dado("^pesquiso por um produto$")
    public void pesquiso_por_um_produto()  {
        compraPage.pesquisaPorProdutoVestido();
        compraPage.selecionaCorProdutoVestido();
        compraPage.selecionaTamanhoProdutoVestido();
    }
    @Quando("^eu selecionar o produto pesquisado e adicona-lo ao carrinho$")
    public void eu_selecionar_o_produto_pesquisado_e_adicona_lo_ao_carrinho()  {
        compraPage.adicionarProdutoCarrinhoVestido();
        compraPage.continuarCompra();
        compraPage.pesquisaPorProdutoShort();
        compraPage.selecionaCorProdutoShort();
        compraPage.adicionarProdutoCarrinhoShort();
        compraPage.continuarCompra1();
        compraPage.pesquisaPorProdutoblusa();
        compraPage.selecionaProdutoCorBlusa();
        compraPage.botaoSelecionaQuantidadeBlusa();
        compraPage.adicionarProdutoCarrinhoBlusa();
        compraPage.botaoFinalizarCompra();
        compraPage.botaoVerificarCarrinho();
    }
    @Então("^vejo o produto no carrinho para finalizar a minha compra$")
    public void vejo_o_produto_no_carrinho_para_finalizar_a_minha_compra()  {
    }
}
