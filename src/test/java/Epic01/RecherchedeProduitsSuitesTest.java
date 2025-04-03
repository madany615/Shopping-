package Epic01;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RecherchedeProduitsSuitesTest {
  @Test
   public void recherche_produits_excistants()  {

      ChromeDriver driver = new ChromeDriver();
       driver.get("https://shop-in.ovh/");
driver.manage().window().maximize();

driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div[2]/div/div[3]/div/button")).click();

driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/form/input")).sendKeys("T-shirt"+ Keys.ENTER);
      driver.findElement(By.xpath("//a[@class='woocommerce-store-notice__dismiss-link']")).click();

}@Test

public void mettre_un_produit_dans_le_panier(){

      ChromeDriver driver = new ChromeDriver();
      driver.get("https://shop-in.ovh/");

      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      driver.findElement(By.xpath("//li[@id='menu-item-689']//a[@class='ct-menu-link']")).click();
      driver.findElement(By.xpath("//li[@id='menu-item-1552']//a[@class='ct-menu-link']")).sendKeys(Keys.ENTER);

      driver.findElement(By.xpath("//a[@class='woocommerce-store-notice__dismiss-link']")).click();

      driver.findElement(By.xpath("//button[@class='ct-button ct-cookies-decline-button']")).sendKeys(Keys.ENTER);
      driver.findElement(By.xpath("//a[@aria-label='Air Jordan 1 Low FlyEase']//img[@class=' wp-post-image']")).click();
      driver.findElement(By.id("quantity_67dded090d8b9")).sendKeys("698");
      driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt'] ")).sendKeys (Keys.ENTER);

}
}