package epic04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GestionAlerteSuiteTests {

    ChromeDriver driver =new ChromeDriver();

    @BeforeEach
    public void init (){


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();

    }

    @Test
    public void acceptation_alert (){

driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

//Thread.sleep(500);
driver.switchTo().alert().accept();
String texte_actual = driver.findElement(By.id("result")).getText();

          //String texte_attendu = "You clicked: Ok";

        //Assertions.assertEquals(texte_actual, texte_attendu);

        Assertions.assertTrue(texte_actual.contains("Ok"));



    }
@Test
    public void cancel_alert(){

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        driver.switchTo().alert().dismiss();
        String texte_actual = driver.findElement(By.id("result")).getText();
        String texte_attendu = "You clicked: Cancel";
        Assertions.assertEquals(texte_attendu, texte_actual);


    }

@AfterEach

    public void close(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.close();
       // driver.getScreenshotAs('C://temp//image.png');





}

}



