package Epic01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class GestionFenetres {


    ChromeDriver driver = new ChromeDriver();

    HomePages hp = new HomePages(driver);

    @BeforeEach

    public void init (){

        hp.acceder_a_url("https://shop-in.ovh/");

    }


@Test
    public void interaction_Shopping_Ups(){

        //Admettant que le code d'achat produit est fait

        // Le code ci bas permet d'ouvrir une nouvelle fenetre et d'acceder au site UPS

        // Etape 1 : Ouvrir un nouvel onglet vide

        ((JavascriptExecutor)driver ).executeScript("window.open('');");

        //on a recuperé toutes les fenetres ouvertes et on les a mises dans un tableau qui s'appelle arraylist

         ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());

         //passer au nouvel onglet qui a indew 1

         driver.switchTo().window(windows.get(1));

         //changer le deuxieme site
    hp.acceder_a_url("https://the-internet.herokuapp.com/");

    ((JavascriptExecutor) driver)
            .executeScript("window.scrollTo(0, document.body.scrollHeight)");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    // revenir au premier onglet ( shoppin) qui a index 0

    // driver.switchTo(). windows(windows.get(0));






    }



}
