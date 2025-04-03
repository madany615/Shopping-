package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PagesProduits {




     ChromeDriver driver;
    public PagesProduits(ChromeDriver driver){

        this.driver = driver;




    }


    public void choix_produit(String nom_produit){


        driver.findElement(By.xpath("//li[@id='menu-item-689']//a[@class='ct-menu-link']")).click();
        driver.findElement(By.xpath("//a[@class='woocommerce-store-notice__dismiss-link']")).click();

       //WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       // Wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@aria-label='"+nom_produit+"']")))).click();




        driver.findElement(By.xpath("//a[@aria-label='"+nom_produit+"']")).click();

        driver.findElement(By.xpath("//button[@name='add-to-cart']")).click();
        driver.findElement(By.xpath("//a[@class='added_to_cart wc-forward']")).click();
        driver.findElement(By.id("coupon_code")).sendKeys("PROMO24");
        driver.findElement(By.xpath("//button[@value='Appliquer le code promo']")).click();





    }








}
