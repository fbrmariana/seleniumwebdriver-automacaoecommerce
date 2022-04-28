package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class CompraStep {

    WebDriver driver;

    @Dado("^que eu estou no site da Renner$")
    public void que_eu_estou_no_site_da_Renner() {
        driver = new ChromeDriver();
        driver.get("https://www.lojasrenner.com.br/");
        driver.manage().window().maximize();
    }

    @Quando("^eu procurar um produto$")
    public void eu_procurar_um_produto() throws InterruptedException {
        driver.findElement(By.name("Ntt"))
                .click();
        driver.findElement(By.name("Ntt"))
                .sendKeys("PERFUME CAROLINA HERRERA 212 VIP ROSÉ FEMININO EAU DE PARFUM 30ML");
        driver.findElement(By.name("Ntt")).sendKeys(Keys.ENTER);


    }

    @E("^adiciona-lo ao carrinho$")
    public void adiciona_lo_ao_carrinho() throws InterruptedException {

        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.className("ProductBox_productInfo__2ASOw"));

        Thread.sleep(2000);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", elements.get(1));
    }



    @Então("^eu visualizo o produto no carrinho$")
    public void eu_visualizo_o_produto_no_carrinho() throws InterruptedException  {
        driver.findElement(By.className("one_click")).click();
        Thread.sleep(5000); }


}



