package epic05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePages;
import pages.PagesProduits;

import java.time.Duration;

public class Achat_produit_Suites_Tests {

    ChromeDriver driver = new ChromeDriver();
    PagesProduits pp = new PagesProduits(driver);
    HomePages hp = new HomePages(driver);




    @BeforeEach
     public void similar (){

        hp.acceder_a_url("https://shop-in.ovh/");

    }
    @Test
    public void Achat_produit_disponible1() {

    pp.choix_produit("Air Jordan 1 Low");

    }

   @Test
    public void Achat_produit_diponible2(){


        pp.choix_produit("Ballon de match Orbita");


    }

    @AfterEach
    public void close(){
        driver.close();


    }
}
