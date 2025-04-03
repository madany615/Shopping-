package Epic01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePages;

import java.time.Duration;

public class GestionFrames {


    ChromeDriver driver = new ChromeDriver();
    HomePages hp = new HomePages(driver);

    @BeforeEach

    public void init (){

        hp.acceder_a_url("https://the-internet.herokuapp.com/nested_frames");


    }

      @Test
        public void acceder_au_titre(){

          //Switch To Top
                driver.switchTo().frame("frame-top");


         //switch to middle

          driver.switchTo().frame("frame-middle");
             String middle_contenu = driver.findElement(By.id("content")).getText();
             System.out.println(middle_contenu);


          driver.switchTo().parentFrame();
             driver.switchTo().frame("frame-right");

          String right_contenu = driver.findElement(By.tagName("body")).getText();
              System.out.println(right_contenu);


              driver.switchTo().parentFrame();

              driver.switchTo().frame("frame-left");
              String left_contenu= driver.findElement(By.tagName("body")).getText();
              System.out.println(left_contenu);


              driver.switchTo().defaultContent();
              driver.switchTo().frame("frame-bottom");
              String bottom_contenu =     driver.findElement(By.tagName("body")).getText();
               System.out.println(bottom_contenu);
















           // driver.switchTo().defaultContent();
            //driver.findElement(By.xpath("body"));
    }
}
