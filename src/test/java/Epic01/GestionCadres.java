package Epic01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePages;

import java.time.Duration;

public class GestionCadres {



    ChromeDriver driver = new ChromeDriver();

    HomePages hp = new HomePages(driver);

    @BeforeEach

    public void init (){

        hp.acceder_a_url("https://the-internet.herokuapp.com/iframe");

    }
@Test
    public void recuperer_paragraphe_dans_editeur(){
        //L'etape 2 ne peut pas se faire qu'apres le swich vers le iframe a l'aide de la methode "frame" car le texte est situé
    //dans un cadre (mini page HTML située dans la page HTML principale

       driver.switchTo().frame("mce_0_ifr");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    // l'etape 2 : Attente jusuq'a apparition du paragraphe puis recuperation de son contenu


     String texte_actuel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[@id='tinymce']//p"))).getText();
    String texte_attendu = "Your content goes here.";

    Assertions.assertEquals(texte_attendu, texte_actuel);

     //Apres avoir switcher vers la iframe dans l'etape 1 nous devrions retourner a la page principale pour les elements qui sont hors de iframe

    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("//div[@id='page-footer']//a")).click();






    }










@Test
    public void Acceder_au_paragraphe(){

        driver.switchTo().frame("frameset-middle");

       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));


       driver.switchTo().frame("frame-top");

       driver.switchTo().defaultContent();
       driver.findElement(By.xpath("body"));


    }




}
