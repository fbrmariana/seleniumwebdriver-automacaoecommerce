package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;
import java.util.Random;

public class Utils extends RunCucumberTest {
    public static void waitElementBePresent(By element, Integer tempo){
        WebDriverWait wait = new WebDriverWait( getDriver(),tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        
    }

   //public String getEmail(){
   // return "fbr.mariana@gmail.com";*/ //- Para insrir um e-mail especicifico

   public static String getRandomEmail() {
        String email_init = "mariana_";
        String email_final = "@testes.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 99999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_init + resultado + email_final;
        //return fbr.mariana@gmail.com */

       // descobrir a forma de criar um metodo de criar uma senha em java.
       // criar e ultilizar aqui programa
       // Ex:  waitElementBePresent(titleF, 20); usar no metodo de senha no cadastro page,
       // assim como o de elemento estar presente usado no metodo selectTitle

    }

}
