package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.Urls;

import java.time.Duration;

public class HomePages {


       ChromeDriver driver;
       public HomePages (ChromeDriver driver){

           this.driver = driver;

       }

public void acceder_a_url(String url){

           driver.get(url);
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}




}
