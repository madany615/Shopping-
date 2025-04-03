package epic03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ContactSuitesTests {
    ChromeDriver driver = new ChromeDriver();
    @BeforeEach
    public void similar(){
        driver.get("https://shop-in.ovh/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }



@Test
    public void remplir_formulaire_pour_envoyer(){

    //chercher par texte ; une exemple: « //button[normalize-space()=’register’] »))





                driver.manage().window().maximize();

                driver.findElement(By.xpath("//li[@id='menu-item-1096']//a[@href='https://shop-in.ovh/contact/']")).click();
driver.findElement(By.id("wpforms-156-field_0")).sendKeys("Personne");

driver.findElement(By.id("wpforms-156-field_5")).sendKeys("026262626");

driver.findElement(By.id("wpforms-156-field_1")).sendKeys("adresse.mail@gmail.com");

driver.findElement(By.id("wpforms-156-field_2")).sendKeys("Nous sommes entrain de tester le site !! ");

driver.findElement(By.xpath("//a[@class='woocommerce-store-notice__dismiss-link']")).click();



driver.findElement(By.id("wpforms-submit-156")).sendKeys(Keys.ENTER);

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

String resultat_actual =  driver.findElement(By.xpath("//div[@id='wpforms-confirmation-156']/p")).getText();

String resultat_attendu = "Merci de nous avoir contacté! Nous vous contacterons sous peu.";
//assertion=  auditer cad : comparer un resultat attendu avec un resultat actuel
    Assertions.assertEquals(resultat_attendu,resultat_actual);



    }
    @Test
public void mettre_une_adresse_mail_non_valide(){

    

     driver.manage().window().maximize();

    driver.findElement(By.xpath("//li[@id='menu-item-1096']//a[@href='https://shop-in.ovh/contact/']")).click();
    driver.findElement(By.id("wpforms-156-field_0")).sendKeys("Personne");

    driver.findElement(By.id("wpforms-156-field_5")).sendKeys("026262626");
    driver.findElement(By.id("wpforms-156-field_1")).sendKeys("adresse.mail");

    driver.findElement(By.id("wpforms-156-field_2")).sendKeys("Nous sommes entrain de tester le site !! ");

    driver.findElement(By.xpath("//a[@class='woocommerce-store-notice__dismiss-link']")).click();

    driver.findElement(By.id("wpforms-submit-156")).sendKeys(Keys.ENTER);



    String resultat_actual =  driver.findElement(By.id("wpforms-156-field_1-error")).getText();

    String resultat_attendu = "Veuillez saisir une adresse e-mail valide.";

    Assertions.assertEquals(resultat_attendu,resultat_actual);


}
@AfterEach
    public void close(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        driver.close();
}

}
